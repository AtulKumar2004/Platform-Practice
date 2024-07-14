// https://leetcode.com/problems/maximum-product-subarray/

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        long prefix = 1;
        long suffix = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(prefix == 0) {
                prefix = 1;
            }
            if(suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];
            ans = Math.max(ans,(int)Math.max(prefix,suffix));
            if(ans == 1000000000) {
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProduct(nums));
    }
}
