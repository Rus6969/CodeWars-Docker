//package interviewQuestions.Caribou.howTasksLookOpenAsSeparateProject.src.main.java.com.gocaribou.practicum.java;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
////import org.json.JSONObject;
//
///** Information about a transaction in the data store. */
//public class Transaction {
//    /** Unique identifier for the transaction. */
//    private String transactionId;
//    /** NASDAQ symbol. */
//    private String symbol;
//    /** Price of the transaction. */
//    private String price;
//    /** When the transaction was first created. */
//    private Date createdAt;
//    /** When the transaction was last updated. */
//    private Date updatedAt;
//
//    public String getTransactionId() {
//        return transactionId;
//    }
//
//    public void setTransactionId(String transactionId) {
//        this.transactionId = transactionId;
//    }
//
//    public String getSymbol() {
//        return symbol;
//    }
//
//    public void setSymbol(String symbol) {
//        this.symbol = symbol;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//    public JSONObject toJson() {
//        JSONObject object = new JSONObject();
//        object.put("transactionId", this.transactionId);
//        object.put("symbol", this.symbol);
//        object.put("price", this.price);
//        object.put("createdAt", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(this.createdAt));
//        object.put("updatedAt", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(this.updatedAt));
//        return object;
//    }
//}
