package interviewQuestions.Caribou.howTasksLookOpenAsSeparateProject.src.main.java.com.gocaribou.practicum.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

public class StockPrice {
    private String symbol;
    private Date timestamp;
    private String price;

    public StockPrice(String symbol, Date timestamp, String price) {
        this.setSymbol(symbol);
        this.setTimestamp(timestamp);
        this.setPrice(price);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("symbol", this.symbol);
        object.put("timestamp", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(this.timestamp));
        object.put("price", this.price);
        return object;
    }
}
