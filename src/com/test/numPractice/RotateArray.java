package numPractice;

/**
 * Created by ashah on 8/20/18.
 */

//Given an array, rotate the array to the right by k steps, where k is non-negative.

public class RotateArray {

    public static void main(String[] args){
        int[] array= {1,2,3,4,5,6,7,8,9,10};
        int k=6;
        rotateArray(array,k);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }

    private static void rotateArray(int[] array, int rotationNumber) {
        int temp;
        if(rotationNumber<array.length){
            for(int rotate=0;rotate<rotationNumber;rotate++){
                temp=array[array.length-1];
                for(int i=array.length-2;i>=0;i--){
                    array[i+1]=array[i];
                }
                array[0]=temp;
            }
        }
    }

}
