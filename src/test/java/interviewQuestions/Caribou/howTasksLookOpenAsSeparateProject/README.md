# Caribou Java Coding Practicum

## Problems

### Part one: Reading stock prices from json

See `src/main/java/com/gocaribou/practicum/java/Part1.java` for stubbed code and replace functions with TODO with real logic.
Tip: Don't get caught by timezones and remember UTC is a thing.

To run: `mvn package && java -cp target/prac-java-1.0-SNAPSHOT.jar com.gocaribou.practicum.java.Part1 <symbol> <yyyy-mm-dd> <hour (1-24)>`

### Part two: Reading and writing data to/from a transaction ledger

See `src/main/java/com/gocaribou/practicum/java/Part2.java` for stubbed code and replace functions with TODO with real logic.

To store or update a transaction: `mvn package && java -cp target/prac-java-1.0-SNAPSHOT.jar com.gocaribou.practicum.java.Part2 put <transaction-id> <symbol> <price>`

To get a transaction: `mvn package && java -cp target/prac-java-1.0-SNAPSHOT.jar com.gocaribou.practicum.java.Part2 get <transaction-id>`
You are allowed to use whichever data store meets your fancy, whether that be a flat file or database.

**Important:** the value of `updatedAt` must not be changed if the symbol and price have not changed. In other words, if you run the exact same `put` command twice, `updatedAt` should only be set once.
