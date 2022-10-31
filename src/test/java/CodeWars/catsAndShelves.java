package CodeWars;

public class catsAndShelves {
/*
An infinite number of shelves are arranged one above the other in a staggered fashion. The cat can
 jump up to 3 shelves at the same time: from shelf 1 to shelf 2 or 4 (the cat cannot climb on the shelf directly above its head)
 */

        public static int solution(int start, int finish)
        {
            int diff = (finish - start);
            return diff/3 + diff % 3;
        }


    public static void main(String[] args) {
        System.out.println(solution(1,5));
    }
    }

