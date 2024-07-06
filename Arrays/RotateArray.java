// https://leetcode.com/problems/rotate-array/description/

import java.util.Arrays;

public class RotateArray {

    // public static void rotate(int[] nums, int k) {
    //     int m = nums.length - 1;
    //     for (int i = 0; i < k; i++) {
    //         int last = nums[nums.length - 1];
    //         int first = nums[0];
    //         nums[0] = last;
    //         for (int j = nums.length - 1; j > 1; j--) {
    //             nums[j] = nums[j - 1];
    //         }
    //         nums[1] = first;
    //         System.out.println(Arrays.toString(nums));
    //     }
    // }

    public static void rotate(int nums[],int k) {
        rotatenums(nums,0,nums.length-1);
        rotatenums(nums,0,k-1);
        rotatenums(nums,k,nums.length-1);
    }

    public static void rotatenums(int nums[],int left,int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}

