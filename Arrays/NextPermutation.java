// https://leetcode.com/problems/next-permutation/

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int i=n-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                ind = i;
                break;
            }
        }
        if(ind == -1) {
            for(int i=0;i<n/2;i++) {
                int temp = nums[i];
                nums[i] = nums[n-i-1];
                nums[n-i-1] = temp;
            }
            return;
        }
        for(int i=n-1;i>ind;i--) {
            if(nums[i] > nums[ind]) {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        int length = n-(ind+1);
        for(int i=ind+1;i<(ind+1+length/2);i++) {
            int temp = nums[i];
            nums[i] = nums[n-i+ind];
            nums[n-i+ind] = temp;
        }
    }
}
