// https://leetcode.com/problems/single-number/

public class FindUnique {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int ele: nums) {
            ans = ans ^ ele;
        }
        return ans;
    }
}
