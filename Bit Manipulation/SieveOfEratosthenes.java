// https://leetcode.com/problems/count-primes/description/

public class SieveOfEratosthenes {
    public static int countPrimes(int n) {
        int primes[] = new int[n+1];
        for(int i=0;i<n;i++) {
            primes[i] = 1;
        }
        for(int i=2;i<Math.sqrt(n);i++) {
            if(primes[i] == 1) {
                for(int j=i*i;j<=n;j+=i) {
                    primes[j] = 0;
                }
            }
        } 
        int c=0;
        for(int i = 2;i<=n;i++) {
            if(primes[i] == 1) c++;
        }
        return c;
    }
}
