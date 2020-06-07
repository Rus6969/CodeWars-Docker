package EcryptionJava;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class lesson1 {
    /*
    Java provides a class named MessageDigest which belongs to the package java.security.
    This class supports algorithms such as SHA-1, SHA 256, MD5 algorithms to convert an arbitrary length message to a message digest.
To convert a given message to a message digest, follow the steps given below −

     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //Reading data from user
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Ruslan  enter a message which you would like to hide");
        String message = scan.nextLine();

        // creating message digest object
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");

        //passing data to created message
        messageDigest.update(message.getBytes());

        //Compute the message digest
        byte[] digest = messageDigest.digest();
        System.out.println(digest);

        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        System.out.println("Hex format : " + hexString.toString());


    }
}
