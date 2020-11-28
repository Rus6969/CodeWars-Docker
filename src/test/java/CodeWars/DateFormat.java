package CodeWars;

import java.util.Arrays;

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
 */
public class DateFormat {
    public static void main(String[] args) {

       String time ="07:05:45PM";

        if(time.contains("AM")){
            time = time.replace("AM", "");
            String[] timeArr = time.split(":"); // {07,05,45}:
            if(timeArr[0].equals("12")){
                timeArr[0] = "00";
            }
            time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];//07 :05 :45
        }
        else if(time.contains("PM")){
            time = time.replace("PM", "");
            String[] timeArr = time.split(":");
            if(!timeArr[0].equals("12")){
                timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0])+12);
            }
            time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
        }
        System.out.println(time);
    }
}
