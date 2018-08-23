package numPractice;

/**
 * Created by ashah on 8/22/18.
 */

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

public class MoveZerosDown {
    public static void main(String[] args) {
        int[] arr = {0,0, 1, 0, 2, 3, 6, 7, 0, 0, 5, 4};
        System.out.println("Array before the operation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        moveZerosDown(arr);
        System.out.println();
        System.out.println("Array after the operation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private static void moveZerosDown(int[] arr) {
       int i=0;
       int numberOfOccurrence = 0;
       while(i + numberOfOccurrence < arr.length) {
            if (arr[i] == 0) {
                numberOfOccurrence++ ;
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j-1] = arr[j];
                }
                arr[arr.length-1]=0;
            }else{
                i++;
            }
        }
    }

}
