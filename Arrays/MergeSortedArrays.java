// https://leetcode.com/problems/merge-sorted-array/
import java.util.*;
public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i=0;
        // int j=0;
        // ArrayList<Integer> list = new ArrayList<>();
        // while(i < m && j < n) {
        //     if(nums1[i] > nums2[j]) {
        //         list.add(nums2[j]);
        //         j++;
        //     }
        //     else {
        //         list.add(nums1[i]);
        //         i++;
        //     }
        // }
        // while(i<m) {
        //     list.add(nums1[i]);
        //     i++;
        // }
        // while(j<n) {
        //     list.add(nums2[j]);
        //     j++;
        // }
        // i=0;
        // for(int ele: list) {
        //     nums1[i++] = ele;
        // }

        int left = m-1;
        int right = 0;
        while(left >= 0 && right < n) {
            if(nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        for(int i=m;i<n+m;i++) {
            nums1[i] = nums2[i-m];
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n=3;
        merge(nums1, m, nums2, n);
        for(int i=0;i<m+n;i++) {
            System.out.println(nums1[i]);
        }
    }
}
