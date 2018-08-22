package numPractice;

import java.util.Arrays;

/**
 * Created by ashah on 8/21/18.
 */
//Given two arrays, write a function to compute their intersection.
//Each element in the result should appear as many times as it shows in both arrays.
//The result can be in any order.

public class Intersection {

    public static void main(String[] args){
        int[] array1 = {1,2,2,1,7} ;
        int[] array2 = {2,2,5,7,9};


        int[] array3 = findIntersection(array1,array2);
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]+ ",");
        }

    }

    private static int[] findIntersection(int[] array1, int[] array2) {

        int length = array1.length > array2.length ? array2.length : array1.length;
        int[] result = new int[length];
        int k=0;
        Arrays.sort(array1);
        Arrays.sort(array2);



        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    result[k++]=array1[i];
                    break;
                }if(array2[j]>array1[i]){
                    break;
                }

            }
        }
        return result;

    }

}
