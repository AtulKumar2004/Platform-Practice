// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

public class CheckRotatedSortedArray {
    public boolean check(int[] nums) {
        int k = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}
