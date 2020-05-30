package CodeWars;

import java.util.Calendar;

class DaysBetweenDate {
    public static void main(String[] args) {
        // Month value in Java is 0-based so 11 means December.
        Calendar start = Calendar.getInstance();
        start.set(1991, 3, 31);
        Calendar end = Calendar.getInstance();
        end.set(2020, 5, 30);

        System.out.print(" TIMA Number Fridays between " +
                start.getTime() + " and " + end.getTime() + " are: ");

        int numberOfDays = 0;
        int monday = Calendar.FRIDAY;

        while (start.before(end)) {
            if (start.get(Calendar.DAY_OF_WEEK) == monday) {
                numberOfDays++;
                start.add(Calendar.DATE, 7);
            } else {
                start.add(Calendar.DATE, 1);
            }
        }

        System.out.println(numberOfDays);



            }


        }
