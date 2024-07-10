import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=i+1;j<nums.length;j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {-1,-1};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(target-nums[i])) {
                return new int[] {hm.get(target-nums[i]),i};
            } else {
                hm.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
