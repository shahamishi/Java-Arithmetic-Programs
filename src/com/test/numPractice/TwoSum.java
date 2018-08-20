package com.test.numPractice;

import java.util.*;

/**
 * Created by ashah on 8/24/17.
 */
//Given an array of integers, find two numbers such that they add up to a specific target number.

//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
// Please note that your returned answers (both index1 and index2) are not zero-based.
//
//        For example:
//
//        Input: numbers={2, 7, 11, 15}, target=9
//        Output: index1=1, index2=2
public class TwoSum {

    public static void main(String[] args){
//        int[] input = {1,2,3,4,6,7,8,11,15};
        int[] input = {2,3,4,7,1,8,6,11,15};
        int target=9;
        List<int[]> twoNums = getTwoSum(input,target);
        for(int[] result: twoNums ) {
            System.out.println("The indices which make the taget(" + target + ") sum are: " + result[0] + " and " + result[1]);
        }
    }

    private static List<int[]> getTwoSum(int[] input,int target){
        List<int[]> resultList=new ArrayList<>();
        int[] result = {0,0};
        if(input.length<2){
            return resultList;
        }
        Map<Integer,Integer> map =  new HashMap<Integer,Integer>();
        for(int i=0;i<input.length;i++){
            if(map.containsKey(input[i])){
                result = new int[]{0,0};
                result[0]=map.get(input[i])+1;
                result[1]=i+1;
                resultList.add(result);
            }else{
                map.put(target-input[i],i);
            }
        }
        return resultList;
    }


}
