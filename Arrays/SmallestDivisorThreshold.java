// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

public class SmallestDivisorThreshold {
    public int sumByD(int nums[],int div) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++) {
            sum += Math.ceil((double)nums[i]/(double)div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            max = Math.max(nums[i],max);
        }
        int start = 1;
        int end = max;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(sumByD(nums,mid) <= threshold) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
}
