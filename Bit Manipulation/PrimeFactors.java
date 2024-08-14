// https://www.geeksforgeeks.org/problems/prime-factors5052/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=Prime-Factors

import java.util.*;

public class PrimeFactors {
    public static int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(N);i++) {
            if(N%i == 0) {
                list.add(i);
                while(N%i == 0) {
                    N = N / i;
                }
            }
        }
        if(N != 1) list.add(N);
        int ans[] = list.stream().mapToInt(i -> i).toArray();
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(AllPrimeFactors(100)));

    }
}
