package interviewQuestions.Caribou.howTasksLookOpenAsSeparateProject.src.main.java.com.gocaribou.practicum.java;

import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Part2 {
    public static void main(String[] args) throws IOException {
        switch (args[0]) {
            case "put":
                JSONObject object = new JSONObject();
                object.put("result", putTransaction(args[1], args[2], args[3]));
                System.out.println(object);
                break;
//            case "get":
//                System.out.println(getTransaction(args[1]));
//                break;
            default:
                System.out.println("Unknown action: " + args[0]);
                break;
        }
    }

    /**
     * Write a transaction to the data store. If the transaction ID already
     * exists in the data store, update the values in the store.
     *
     * The return value is one of:
     *
     * - `created`: a new entry was added to the data store
     * - `updated`: an existing entry was updated in the data store
     *
     * @param transactionId Unique transaction ID
     * @param symbol        NASDAQ symbol
     * @param price         Transaction cost
     *
     * @return Whether the transaction was `created` or `updated`
     */
    private static String putTransaction(String transactionId, String symbol, String price) throws IOException {
        // TODO : Write the transaction to the data store
        FileWriter writer = new FileWriter("Files.txt");
        writer.write(transactionId);
        writer.write(symbol);
        writer.write(price);
        writer.close();

        return "created";
    }

    /**
     * Retrieve a transaction from the data store. If no transaction is found,
     * return null.
     *
     * @param transactionId Unique transaction ID
     *
     * @return Transaction information
     */
    private static Transaction getTransaction(String transactionId) throws IOException {

        FileReader file = new FileReader(
                "test.txt");

        String transcations = "";

        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get("File.txt"));
        }  catch (IOException e)
        {
            e.printStackTrace();
        }





return Transaction ;
}
}
