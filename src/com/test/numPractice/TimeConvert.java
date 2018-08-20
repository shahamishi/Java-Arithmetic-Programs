package numPractice;
import java.util.*;
import java.io.*;
/**
 * Created by ashah on 8/18/17.
 */
//Using the Java language, have the function TimeConvert(num) take the num parameter being passed and
// return the number of hours and minutes the parameter converts to
// (ie. if num = 63 then the output should be 1:3).
// Separate the number of hours and minutes with a colon.
// Sample Test Cases
//        Input:126
//        Output:"2:6"
//
//        Input:45
//        Output:"0:45"
public class TimeConvert {
    private static String TimeConvert(int num) {
        String time = new String();
        int hours;
        int minutes;

        minutes=num%60;
        hours=num/60;

        time = String.valueOf(hours) +":"+ String.valueOf(minutes);
        return time;

    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please provide your input here");
        Scanner s = new Scanner(System.in);
        System.out.print(TimeConvert(Integer.valueOf(s.nextLine())));
    }
}
