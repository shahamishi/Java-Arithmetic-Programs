package numPractice;

import java.util.Scanner;

/**
 * Created by ashah on 8/18/17.
 */
//Reverse a number: So 123 should become 321

public class ReverseANumber {

    private static long printReverse(long number){
        long num=number;
        long remainder=0;
        long reverseNumber=0;

        while(num>0){
            remainder=num%10;
            num=num/10;
            reverseNumber=(reverseNumber*10)+(remainder);
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.println("Provide a number to be reversed");
        Scanner s = new Scanner(System.in);
        System.out.print(printReverse(Long.valueOf(s.nextLine())));
    }
}
