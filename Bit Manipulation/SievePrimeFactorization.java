// https://www.geeksforgeeks.org/problems/prime-factorization-using-sieve/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=prime-factorization-using-sieve

import java.util.ArrayList;
import java.util.List;

public class SievePrimeFactorization {
    public static List<Integer> findPrimeFactors(int N) {
        int primes[] = new int[N+1];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<N+1;i++) {
            primes[i] = 1;
        }
        for(int i=2;(i*i)<N+1;i++) {
            if(primes[i] == 1) {
                for(int j=i*i;j<N+1;j+=i) {
                    primes[j] = 0;
                }
            }
        }
                
        for(int i=2;i*i<=N;i++) {
            if(primes[i] == 1 && N%i == 0) {
                while(N%i == 0) {
                    list.add(i);
                    N = N/i;
                }
            }
        }
        if(N != 1) list.add(N);
        return list;
    }
}
