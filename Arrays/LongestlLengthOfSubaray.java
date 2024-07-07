// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

import java.util.*;
public class LongestlLengthOfSubaray {
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int prefix[] = new int[N];
        prefix[0] = A[0];
        int sum = 0;
        int length = 0;
        for (int i = 1; i < N; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (i == j)
                    sum = A[i];
                else if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (sum == K) {
                    length = Math.max(length, j - (i - 1));
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int A[] = {-1, 2, 3};
        int K = 6;
        System.out.println(lenOfLongSubarr(A, 3, K));
    }
}
