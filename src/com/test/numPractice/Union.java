package numPractice;

import java.util.Arrays;

/**
 * Created by ashah on 8/21/18.
 */
//Given two arrays, write a function to compute their Union.
////Each element in the result should appear as many times as it shows in both arrays.
public class Union {
    public static void main(String[] args){
        int[] array1 = {1,2,3,3} ;
        int[] array2 = {3,4,4};


        int[] array3 = findUnion(array1, array2);
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]+ ",");
        }

    }

    private static int[] findUnion(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int k=0;
        Arrays.sort(array1);
        Arrays.sort(array2);
        int i=0;
        int j=0;
        for(;i<array1.length;) {
            for (; j < array2.length; ) {
                if (array1[i] < array2[j]) {
                    result[k++] = array1[i++];
                    break;
                } else if (array1[i] > array2[j]) {
                    result[k++] = array2[j++];
                    break;
                } else {
                    result[k++] = array1[i++];
                    j++;
                    break;
                }

            }
        }
         if(i!=array1.length){
            for(;i<array1.length;){
                result[k++]=array1[i++];
            }
        }
        if(j!=array2.length){
            for(;j<array2.length;){
                result[k++]=array2[j++];
            }
        }
        return result;
    }

}
