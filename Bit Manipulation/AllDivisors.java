// https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1?utm_source=youtube&amp%3Butm_medium=collab_striver_ytdescription&amp%3Butm_campaign=all-divisors-of-a-number

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisors {
    public static void print_divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++) {
            if(n%i == 0) {
                list.add(i);
                if(n/i != i) {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for(int i:list) {
            System.out.print(i+" ");
        }
    }
}
