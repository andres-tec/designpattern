package virtual_proxy_pattern;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Pipe.SourceChannel;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;

class ImageProxy implements Icon {
    private volatile ImageIcon imageIcon;
    private final URL imageURL;
    private boolean retrieving = false;

    public ImageProxy(URL path) { 
        imageURL = path; 
    }

    public int getIconWidth() {
        return (imageIcon != null) ? imageIcon.getIconWidth() : 800;
    }

    public int getIconHeight() {
        return (imageIcon != null) ? imageIcon.getIconHeight() : 600;
    }

    private synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading album cover, please wait...", x + 300, y + 190);

            if (!retrieving) {
                retrieving = true;

                new SwingWorker<ImageIcon, Void>() {
                    @Override
                    protected ImageIcon doInBackground() throws Exception {
                    	 HttpURLConnection connection = (HttpURLConnection)imageURL.openConnection();
                    	 connection.setRequestMethod("GET");
                    	 connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64)");

                    	 int resposeCode =connection.getResponseCode();
                    	 if (resposeCode ==403) {
							System.out.println("Access Denied: HTTP 403 Forbidden");
							return null;
						}else {
							ImageIcon icon=null;
							  try (InputStream in = connection.getInputStream()) {
						            Image image = ImageIO.read(in);
						            icon = new ImageIcon(image);
						        }catch (Exception e) {
									// TODO: handle exception
						        	e.printStackTrace();
								}
                        	System.out.println("connecion sucessful");
                        	return icon;
                         } 
                    }

                    @Override
                    protected void done() {
                        try {
                            ImageIcon loadedIcon = get(); // Retrieve result
                            setImageIcon(loadedIcon);
                            System.out.println(loadedIcon);
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }.execute();
            }
        }
    }
}

