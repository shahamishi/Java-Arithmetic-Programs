package numPractice;

import java.util.*;
/**
 * Created by ashah on 8/26/18.
 */
//From given max number, find out the sum of the even numbers in the fibonacci series until max number. Considering Fibonacci series starts with 1,2,3,5,...

public class FibonacciSum {


    public static long solution(double max) {
        List<Integer> fibonacciSeq = new ArrayList<Integer>();
        fibonacciSeq.add(1);
        fibonacciSeq.add(2);
        int prev2 = 1;
        int prev1 = 2;
        int sum=prev2+prev1;
        long evenSum = 2;
        while(sum < max){
            if(sum%2==0){
                evenSum+=sum;
            }
            fibonacciSeq.add(sum);
            prev2=prev1;
            prev1=sum;
            sum=prev2+prev1;

        }
        return evenSum;
    }

    public static void main(String[] args){
        long number=solution(100);
        System.out.print(number);
    }

}
