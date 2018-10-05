package numPractice;

import java.util.*;

/**
 * Created by ashah on 8/29/17.
 */
//Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

//        Note:
//        Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
//        The solution set must not contain duplicate quadruplets.
public class FourSum {

    public static void main(String[] args){
        int[] input = {1, 0, -1, 0, -2, 2};
        int target = -3;

        List<int[]> pairs = getPairs(input,target);
        System.out.println("Pairs");
    }

    private static List<int[]> getPairs(int[] input, int target) {
        List<int[]> returnList = new ArrayList<int[]>();
        Arrays.sort(input);

        Stack<Integer> combination = new Stack<Integer>();
        int currentSum=0;
        int count=0;
        for(int i=0;i<input.length;i++){
//            if(input[i]>=target){
//                break;
//            }
            combination.push(input[i]);
            count++;
            currentSum = currentSum + input[i];
            for(int j=i+1;j<input.length;j++){
                if(input[j]>=target){
                    break;
                }else{
                    if(target-currentSum<=input[j]){
                        combination.push(input[j]);
                        count++;
                    }
                }
            }
        }
        return returnList;
    }

}
