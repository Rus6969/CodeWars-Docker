package CodeWars;

public class VASIL {
    //The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line.
    // Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
    //
    //Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
    //
    //Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?
    //
    //Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.
    public static String tickets(int[] Ochered) {
        int money25 = 0;
        int money50 = 0;
        for (int i = 0; i < Ochered.length; i++) {
            if (Ochered[i] == 25)
                money25++;
            if (Ochered[i] == 50) {
                money25--;
                money50++;
            }
            if (Ochered[i] == 100) {
                if (money50 > 0) {
                    money50--;
                    money25--;
                } else {
                    money25 -= 3;
                }
            }
            if (money25 < 0) return "NO";
        }
        return "YES";
    }


    public static void main(String[] args) {
        int[] line={100,25,50,100};
        System.out.println(tickets(line));
    }
}

