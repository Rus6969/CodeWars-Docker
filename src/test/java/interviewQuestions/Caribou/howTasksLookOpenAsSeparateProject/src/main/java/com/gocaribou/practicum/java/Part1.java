package interviewQuestions.Caribou.howTasksLookOpenAsSeparateProject.src.main.java.com.gocaribou.practicum.java;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class Part1 {
    public static void main(String[] args) throws Exception {
        System.out.println(lookupStockPrice(readData(loadStockPrices()), args[0], args[1], args[2]).toJson());
    }

    private static JSONObject loadStockPrices() {
        try {
            return new JSONObject(Files.readString(Path.of("sample-data.json")));
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
            return new JSONObject(); // never reached
        }
    }

    /**
     * Ingest a JSON object and return a type-checked dataset.
     *
     * @param json Input JSON object
     *
     * @return Type-checked dataset
     */
    private static StockPrice[] readData(JSONObject json) throws Exception {
            // TODO : Convert JSON object to StockPrice[]

        String[] StockPrice= new String[10];
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("sample-data.json"));
        String price = (String) jsonObject.get("price");
        JSONArray jsonArray = (JSONArray) jsonObject.get("price");
        Object ob = new JSONParser().parse(new FileReader("sample-data.json"));

        // typecasting ob to JSONObject
        JSONObject js = (JSONObject) ob;


//
//        ArrayList<String> list = new ArrayList<String>();
//        JSONArray jsonArray = (JSONArray)js.get("price");
//        if (jsonArray != null) {
//            int len = jsonArray.length();
//            for (int i=0;i<len;i++){
//                list.add(jsonArray.get(i).toString());
//            }
//        }
//
//        System.out.println(list);


//        JSONObject myjson = new JSONObject("sample-data.json");
//        JSONArray the_json_array = myjson.getJSONArray("price");
//        int size = the_json_array.length();
//        ArrayList<JSONObject> arrays = new ArrayList<JSONObject>();
//        for (int i = 0; i < size; i++) {
//            JSONObject another_json_object = the_json_array.getJSONObject(i);
//            arrays.add(another_json_object);
//        }


        return new StockPrice[] {};
    }

    /**
     * Lookup a stock price from a dataset.
     *
     * @param stockPrices The dataset
     * @param symbol      The NASDAQ symbol of the stock
     * @param date        The date in YYYY-MM-DD format
     * @param hour        The hour of the day, between 1 and 24
     *
     * @return The stock price entry of that symbol at that date and hour
     */
    private static StockPrice lookupStockPrice(StockPrice[] stockPrices, String symbol, String date, String hour) {
        // TODO : Find StockPrice entry in stockPrices at the given symbol,
        // date, and hour and return it
        return new StockPrice("TODO", new Date(), "$1.00");
    }
}
