package interviewQuestions.Tenable;
// Java program to copy content from
// one file to another

import java.io.*;
import java.util.*;
public class Copy_Content_FileIntoAnther_File {
    // Java program to copy content from
// one file to another



        public static void copyContent(File a, File b)
                throws Exception
        {
            FileInputStream in = new FileInputStream(a);
            FileOutputStream out = new FileOutputStream(b);

            try {

                int n;

                // read() function to read the
                // byte of data
                while ((n = in.read()) != -1) {
                    // write() function to write
                    // the byte of data
                    out.write(n);
                }
            }
            finally {
                if (in != null) {

                    // close() function to close the
                    // stream
                    in.close();
                }
                // close() function to close
                // the stream
                if (out != null) {
                    out.close();
                }
            }
            System.out.println("File Copied");
        }

        public static void main(String[] args) throws Exception
        {
            Scanner sc = new Scanner(System.in);

            // get the source file name
            System.out.println(
                    "Enter the source filename from where you have to read/copy :");
            String a = sc.nextLine();

            // source file
            File x = new File(a);

            // get the destination file name
            System.out.println(
                    "Enter the destination filename where you have to write/paste :");
            String b = sc.nextLine();

            // destination file
            File y = new File(b);

            // method called to copy the
            // contents from x to y
            copyContent(x, y);
        }
    }


//    public static void main(String[] args)
//            throws IOException
//    {
//
//        // Creating two channels one input and other output
//        // by creating two objects of FileChannel Class
//        FileChannel src
//                = new FileInputStream(
//                "C:\\Users\\Dipak\\Desktop\\input.txt")
//                .getChannel();
//        FileChannel dest
//                = new FileOutputStream(
//                "C:\\Users\\Dipak\\Desktop\\output.txt")
//                .getChannel();
//
//        // Try block to check for exceptions
//        try {
//
//            // Transferring files in one go from source to
//            // destination using transferFrom() method
//            dest.transferFrom(src, 0, src.size());
//            // we can also use transferTo
//            // src.transferTo(0,src.size(),dest);
//        }
//
//        // finally keyword is good practice to save space in
//        // memory by closing files, connections, streams
//        finally {
//
//            // Closing the channels this makes the space
//            // free
//
//            // Closing the source channel
//            src.close();
//
//            // Closing the destination channel
//            dest.close();
//        }
//    }
//
//
//
