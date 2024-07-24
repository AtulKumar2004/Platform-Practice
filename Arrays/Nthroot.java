public class Nthroot {
    public static int multiplyN(int mid,int n,int m) {
        long ans = 1;
        for(int i=1;i<=n;i++) {
            ans *= mid;
            if(ans > m) {
                return 2;
            }
        }
        if(ans == m) {
            return 1;
        }
        return 0;
    }
    public static int NthRoot(int n, int m)
    {
        int start = 1;
        int end = m;
        
        while(start <= end) {
            int mid = (start+end)/2;
            int midN = multiplyN(mid,n,m);
            if(midN == 1) {
                return mid;
            }
            if(midN == 0) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int m = 4096,n=6;
        System.out.println(NthRoot(n,m));
    }
}
