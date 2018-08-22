package numPractice;

/**
 * Created by ashah on 8/21/18.
 */
// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
public class SingleNumber {

    public static void main(String[] args){
        int[] array = {1,2,1,2,5};
        int uniquNumber = findUnique(array);
        if(uniquNumber == 0){
            System.out.println("There is no unique number in the array.");
        }else
        System.out.println("The unique number is: "+ uniquNumber);
    }


//    The Best Solution is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring element.
//    Please note that XOR of two elements is 0 if both elements are same and XOR of a number x with 0 is x.


    private static int findUnique(int[] array) {
        int result = 0;
        for(int i=0;i<array.length;i++){
            result = result ^ array[i];
        }
        return result;
    }
}
