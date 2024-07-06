public class MaxSubarraySum {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int maxSum = Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 0) {
                c=1;
                break;
            }
        }
        if(c==1) {
            for(int i=0;i<nums.length;i++) {
                cs += nums[i];
                if(cs<0) {
                    cs=0;
                }
                maxSum = Math.max(maxSum,cs);
            }
        }
        else{
            for(int i=0;i<nums.length;i++) {
                if(maxSum < nums[i]) {
                    maxSum = nums[i];
                }
            }
        }
        return maxSum;
    }
}
