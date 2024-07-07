// https://leetcode.com/problems/missing-number/

import java.util.*;
public class MissingNumber {
    public int missingNumber(int[] nums) {
        // for(int i=0;i<=nums.length;i++) {
        //     int ch=0;
        //     for(int j=0;j<nums.length;j++) {
        //         if(i == nums[j]) {
        //             ch=1;
        //         }
        //     }
        //     if(ch == 0) {
        //         return i;
        //     }
        // }
        // return -1;

        int ans = 0;
        Arrays.sort(nums);
        if(nums.length == 1) {
            if(nums[0] == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1] != nums[i]+1) {
                return nums[i]+1;
            }
        }
        if(nums[0] == 0) {
            return nums.length;
        } else{
            return 0;
        }
    }
}
