// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++) {
//             int c=0;
//             for(int j=i;j<nums.length;j++) {
//                 if(nums[i] == nums[j]) {
//                     c++;
//                 }
//             }
//             if(c>1) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
     }
}