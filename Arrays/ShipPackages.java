// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class ShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<weights.length;i++) {
            max = Math.max(max,weights[i]);
            sum += weights[i];
        }
        int start = max,end = sum;
        while(start <= end) {
            int mid = (start+end)/2;
            if(reqdNoD(weights,mid) <= days) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
    public int reqdNoD(int[] weights,int mid) {
        int load = 0,days = 1;
        for(int i=0;i<weights.length;i++) {
            if(load+weights[i] > mid) {
                load = weights[i];
                days++;
            } else {
                load += weights[i];
            }
        }
        return days;
    }
}
