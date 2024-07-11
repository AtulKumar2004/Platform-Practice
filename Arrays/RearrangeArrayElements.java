// https://leetcode.com/problems/rearrange-array-elements-by-sign/solutions/1711267/java-simple-o-n/

public class RearrangeArrayElements {
    public int[] rearrangeArray(int[] nums) {
        // int ans[] = new int[nums.length];
        // int c = 0, check = 0, k = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > 0) {
        //         ans[k++] = nums[i];
        //     } else {
        //         continue;
        //     }
        //     for (int j = 0; i < nums.length; j++) {
        //         if (nums[j] < 0 && check != 0) {
        //             check--;
        //         } else if (nums[j] < 0 && check == 0) {
        //             ans[k++] = nums[j];
        //             c++;
        //             check = c;
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // int ans[] = new int[nums.length];
        // int positives[] = new int[nums.length/2];
        // int negatives[] = new int[nums.length/2];
        // int k=0;
        // for(int i=0;i<nums.length;i++) {
        //     if(nums[i] > 0) {
        //         positives[k++] = nums[i];
        //     }
        // } 
        // k=0;
        // for(int i=0;i<nums.length;i++) {
        //     if(nums[i] < 0) {
        //         negatives[k++] = nums[i];
        //     }
        // } 
        // k=0;
        // for(int i=0;i<nums.length/2;i++) {
        //     ans[k++] = positives[i];
        //     ans[k++] = negatives[i];
        // } 
        // return ans;

        int [] out = new int [nums.length];
        int j = 0;
        int k = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                out[j] = nums[i];
                j += 2;
            }else {
                out[k] = nums[i];
                k += 2;
            }
        }
        return out;
    }
}
