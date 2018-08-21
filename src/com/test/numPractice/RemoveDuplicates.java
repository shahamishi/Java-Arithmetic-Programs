package numPractice;

/**
 * Created by ashah on 8/20/18.
 */

/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.*/

public class RemoveDuplicates {

    public static void main(String[] args ){
        int[] nums={1,1,1,4,4,5,5,5,7,8,9,9,9};
//        int[] nums={};
//        int[] nums={1,1,2};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        int length = removeDuplicates(nums);
        System.out.println("The new length of the array is:" + length);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }

    private static int removeDuplicates(int[] nums) {
        int length=0;
        int prev;
        if(nums.length>0){
            length=nums.length;
            prev = nums[0];
            for(int i=0;i<nums.length-1;){
                if(prev==nums[i+1] && nums[i+1]>0){
                    length-=1;
                    for(int j=i;j<nums.length-1;j++){
                        nums[j]=nums[j+1];
                    }
                    nums[length]=0;
                }else{
                    i++;
                    prev = nums[i];
                }
            }
        }
        return length;
    }

}
