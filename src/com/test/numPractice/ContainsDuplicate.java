package numPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ashah on 8/21/18.
 */
//Given an array of integers, find if the array contains any duplicates.

//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

public class ContainsDuplicate {

    public static void main(String[] args){
        Integer[] array= {1,2,3,1};
        boolean containsDuplicate = containsDuplicate(array);
        System.out.print("array contains Duplicate ? ");
        System.out.println(!containsDuplicate ? "Yes" : "No" );

        Integer[] array2= {1,2,3,4};
        boolean containsDuplicate2 = containsDuplicate(array2);
        System.out.print("array contains Duplicate ? ");
        System.out.println(!containsDuplicate2 ? "Yes" : "No" );;
    }

    private static boolean containsDuplicate(Integer[] array) {
        Set<Integer> integerSet = new HashSet<Integer>(Arrays.asList(array));
        return array.length == integerSet.size();

    }

}
