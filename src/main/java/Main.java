
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.logging.*;


public class Main {
    private static Logger outputmsj = Logger.getLogger(Main.class.getName());

    public static void main(String[] args)throws IOException {
        OutputStream recordsLogs = new FileOutputStream(new File("/Users/andrestecpile/Desktop/git-repository/Logger-feb-23.txt"));
        Formatter formatter = new SimpleFormatter();
        StreamHandler streamHandler = new StreamHandler(recordsLogs,formatter);
        outputmsj.addHandler(streamHandler);
        System.out.println("*******************WELCOME TO THE SINGLETON PATTERN*******************************");
        outputmsj.info("so far so good!");
        outputmsj.info("it's going well!");
    }
}
