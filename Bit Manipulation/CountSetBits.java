// https://www.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1

public class CountSetBits {
    public static int countSetBits(int n){
        if(n == 0) return 0;
        int x = largestPowerOf2inrange(n);
        int btill2x = x*(1 << (x-1));
        int msb2xton = n-(1<<x)+1;
        int rest = n-(1<<x);
        int ans = btill2x + msb2xton + countSetBits(rest);
        return ans;
    }
    public static int largestPowerOf2inrange(int n) {
        int x = 0;
        while((1 << x) <= n) {
            x++;
        }
        
        return x-1;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(4));
    }
}
