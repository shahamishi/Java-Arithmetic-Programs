package numPractice;
import java.util.*;
import java.io.*;
/**
 * Created by ashah on 8/17/17.
 */
//Using the Java language, have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it
// (e.g. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18 and the input will always be an integer.
//Sample Test Cases
//Input:4
//Output:24
//
//Input:8
//Output:40320
public class Factorial {
    private static long FirstFactorial(int num) {
        long factorial = 1;
        for(int i=num;i>=1;i--){
            factorial *= i;
        }
        return factorial;

    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please provide the integer.");
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.valueOf(s.nextLine())));
    }
}
