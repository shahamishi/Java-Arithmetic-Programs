package numPractice;
import java.util.*;
import java.io.*;
/**
 * Created by ashah on 8/18/17.
 */

//Using the Java language, have the function SimpleAdding(num) add up all the numbers from 1 to num.
// For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10.
// For the test cases, the parameter num will be any number from 1 to 1000.

//Sample Test Cases
//        Input:12
//        Output:78
//
//        Input:140
//        Output:9870
public class SimpleAdding {

    private static int SimpleAdding(int num) {
        int result=0;
        for(int i=1;i<=num;i++){
            result+=i;
        }
        return result;

    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please provide your input here");
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleAdding(Integer.valueOf(s.nextLine())));
    }
}
