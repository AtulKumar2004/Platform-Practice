// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

import java.util.*;

class LongestSubarray {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i=0;i<A.length;i++) {
            sum += A[i];
            if(sum == K) {
                maxLength = Math.max(maxLength,i+1);
            }
            int rem = sum-K;

            if(hm.containsKey(rem)) {
                maxLength = Math.max(maxLength, i-hm.get(rem));
            }

            if(!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int A[] = { -13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6 };
        int K = 15;
        System.out.println(lenOfLongSubarr(A, A.length, K));
    }

}
