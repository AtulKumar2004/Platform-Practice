// https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int c=1;
        // if(nums.length == 1) {
        //     return 1;
        // }
        // int max = 0;
        // for(int i=0;i<nums.length-1;i++) {
        //     while(i<nums.length-1 && nums[i] == nums[i+1]) {
        //         i++;
        //     }
        //     if(i<nums.length-1 && nums[i]+1 == nums[i+1]) {
        //         c++;
        //     } else if(i<nums.length-1 && nums[i]+1 != nums[i+1]) {
        //         c=1;
        //     }
        //     max = Math.max(max,c);
        // }
        // return max;

        if(nums.length == 0 ) {
            return 0;
        }
        int largest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        for(int it: set) {
            if(!set.contains(it-1)) {
                int count = 1;
                int x = it;
                while(set.contains(x+1)) {
                    x++;
                    count++;
                }
                largest = Math.max(largest,count);
            }
        }
        return largest;
    }
}
