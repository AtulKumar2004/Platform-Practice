// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int min = findMinimum(nums);
        if(target >= nums[min] && target <= nums[nums.length-1]) {
            return search(nums,target,min,nums.length-1);
        } else {
            return search(nums,target,0,min);
        }
    }

    public int search(int[] nums, int target,int left,int right) {
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int findMinimum(int nums[]) {
        int left = 0,right = nums.length-1;
        while(left < right) {
            int mid = left + (right-left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]) {
                return mid;
            } else if(nums[mid] >= nums[left] && nums[mid] > nums[right]) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}
