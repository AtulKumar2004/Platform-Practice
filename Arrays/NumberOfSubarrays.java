// https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.*;
public class NumberOfSubarrays {
    public int subarraySum(int[] nums, int k) {
    //     int c=0;
    //     for(int i=0;i<nums.length;i++) {
    //         int sum = 0;
    //         for(int j=i;j<nums.length;j++) {
    //             sum += nums[j];
    //             if(sum == k) {
    //                 c++;
    //             }
    //         }
    //     }
    //     return c;
    // }

        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}
