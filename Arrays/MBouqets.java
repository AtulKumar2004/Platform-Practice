// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

public class MBouqets {
    public int checkNo(int mid,int arr[],int k) {
        int c=0,noOfB =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] <= mid) {
                c++;
            } else {
                noOfB += (c/k);
                c = 0;
            }
        }
        noOfB += (c/k);
        return noOfB;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++) {
            min = Math.min(min,bloomDay[i]);
        }
        for(int i=0;i<bloomDay.length;i++) {
            max = Math.max(max,bloomDay[i]);
        }
        if((long)m*k <= bloomDay.length) {
            int start = min;
            int end = max;
            while(start <= end) {
                int mid = (start + end) / 2;
                if(checkNo(mid,bloomDay,k) >= m) { 
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
            return start;
        } else {
            return -1;
        }
    }
}
