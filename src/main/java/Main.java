import javaio.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args)throws IOException {
        System.out.println("*******************WELCOME TO THE DECORATOR PATTERN*******************************");
        int c ;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("src/main/resources/test.txt")
                            )
                    );
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
