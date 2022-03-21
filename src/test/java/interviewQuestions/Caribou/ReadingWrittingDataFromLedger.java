package interviewQuestions.Caribou;

import java.io.*;

public class ReadingWrittingDataFromLedger  {
    /*
    Reading and Writing Files in Java
    Character Streams
Character Streams are used to read or write the characters data type. Let's look at the most commonly used classes. All of these classes are defined under java.io package.

Here are some classes you should know that can be used to read character data:

Reader: An abstract class to read a character stream.
InputStreamReader: Class used to read the byte stream and converts to character stream.
FileReader: A class to read the characters from a file.
BufferedReader: This is a wrapper over the Reader class that supports buffering capabilities. In many cases this is most preferable class to read data because more data can been read from the file in one read() call, reducing the number of actual I/O operations with file system.
And here are some classes you can use to write character data to a file:

Writer: This is an abstract class to write the character streams.
OutputStreamWriter: This class is used to write character streams and also convert them to byte streams.
FileWriter: A class to actually write characters to the file.
BufferedWriter: This is a wrapper over the Writer class, which also supports buffering capabilities. This is most preferable class to write data to a file since more data can be written to the file in one write() call. And like the BufferedReader, this reduces the number of total I/O operations with file system
Byte Streams
Byte Streams are used to read or write byte data with files. This is different from before in the way they treat the data. Here you work with raw bytes, which could be characters, image data, unicode data (which takes 2 bytes to represent a character), etc.

In this section we'll take a look at the most commonly used classes. All of these classes are defined under java.io package.

Here are the classes used to read the byte data:

InputStream: An abstract class to read the byte streams.
FileInputStream: A class to simply read bytes from a file.
BufferedInputStream: This is a wrapper over InputStream that supports buffering capabilities. As we saw in the character streams, this is a more efficient method than FileInputStream.
     */

    public static void main(String[] args) {
        String directory = System.getProperty("user.home");
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;
        /// Write the content in file
        try(FileWriter fileWriter = new FileWriter(absolutePath)) {
            String fileContent = "This is a sample text.";
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            // Cxception handling
        }


// Read the content from file
        try(FileReader fileReader = new FileReader(absolutePath)) {
            int ch = fileReader.read();
            while(ch != -1) {
                System.out.print((char)ch);
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }



    }

    /////////////////////////////////////////////////////
//    String directory = System.getProperty("user.home");
//    String fileName = "sample.txt";
//    String absolutePath = directory + File.separator + fileName;
//
//// Write the content in file
//try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
//        String fileContent = "This is a sample text.";
//        bufferedWriter.write(fileContent);
//    } catch (IOException e) {
//        // Exception handling
//    }
//
//// Read the content from file
//try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {
//        String line = bufferedReader.readLine();
//        while(line != null) {
//            System.out.println(line);
//            line = bufferedReader.readLine();
//        }
//    } catch (FileNotFoundException e) {
//        // Exception handling
//    } catch (IOException e) {
//        // Exception handling
//    }
    /////////////////////////////////////////////
//String directory = System.getProperty("user.home");
//    String fileName = "sample.txt";
//    String absolutePath = directory + File.separator + fileName;
//
//// write the content in file
//try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {
//        String fileContent = "This is a sample text.";
//        fileOutputStream.write(fileContent.getBytes());
//    } catch (FileNotFoundException e) {
//        // exception handling
//    } catch (IOException e) {
//        // exception handling
//    }
//
//// reading the content of file
//try(FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
//        int ch = fileInputStream.read();
//        while(ch != -1) {
//            System.out.print((char)ch);
//            ch = fileInputStream.read();
//        }
//    } catch (FileNotFoundException e) {
//        // exception handling
//    } catch (IOException e) {
//        // exception handling
//    }


//   // another readin:
//    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("MyFile.txt");
//            int character;
//
//            while ((character = reader.read()) != -1) {
//                System.out.print((char) character);
//            }
//            reader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}

    /// another write:
//    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("MyFile.txt", true);
//            writer.write("Hello World");
//            writer.write("\r\n");   // write new line
//            writer.write("Good Bye!");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }


}
