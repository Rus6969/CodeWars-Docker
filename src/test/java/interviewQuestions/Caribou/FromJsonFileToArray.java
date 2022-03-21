package interviewQuestions.Caribou;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class FromJsonFileToArray {
    /*
    How to read JSON file in Java – JSONObject and JSONArray
How to read JSON file in Java ?
We will read JSON file using JSON.simple library(json-simple.jar). JSON.simple can be used to encode or decode JSON text and Fully compliant with JSON specification (RFC4627).

As a pre-requisite, you are required to download the json-simple-1.1.1.jar (or) if you are running on maven add the below dependency to your pom.xml
       <dependency>
   <groupId>com.googlecode.json-simple</groupId>
   <artifactId>json-simple</artifactId>
   <version>1.1.1</version>
</dependency>
     */

    public static void main(String args[]) {
        JSONParser parser = new JSONParser();
        try
        {
            Object object = parser
                    .parse(new FileReader("/Users/ruslansamatov/IdeaProjects/CodeWars-Docker/src/test/java/interviewQuestions/Carinable/sample.json"));

            //convert Object to JSONObject
            JSONObject jsonObject = (JSONObject)object;

            //Reading the String
            String name = (String) jsonObject.get("Name");
            Long age = (Long) jsonObject.get("Age");

            //Reading the array
            JSONArray countries = (JSONArray)jsonObject.get("Countries");
            System.out.println(Arrays.toString(new JSONArray[]{countries})+"result!!!!!!!!!!!!!!!!!!!!!!!!");

            //Printing all the values
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Countries:");
            for(Object country : countries)
            {
                System.out.println("\t"+country.toString());
            }
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


