// https://leetcode.com/problems/sum-of-beauty-of-all-substrings/

import java.util.*;

public class BeautyOfString {
   public static int beautySum(String s) {
        // ArrayList<String> list = new ArrayList<>();
        // for(int i=0;i<s.length();i++) {
        //     for(int j=i+1;j<s.length();j++) {
        //         list.add(s.substring(i,j+1));
        //     }
        // }
        // int sum = 0;
        // for(int i=0;i<list.size();i++) {
        //     String str = list.get(i);
        //     int freq[] = new int[26];
        //     int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        //     for(int j=0;j<str.length();j++) {
        //         freq[str.charAt(j)-'a']++;
        //     }
        //     for(int j=0;j<freq.length;j++) {
        //         if(freq[j] > 0) {
        //             max = Math.max(max,freq[j]);
        //             min = Math.min(min, freq[j]);
        //         }
        //     }
        //     sum += (max-min);
        // }
        // return sum;

        // OR

        int sum = 0;
        for(int i=0;i<s.length();i++) {
            int freq[] = new int[26];
            for(int j=i;j<s.length();j++) {
               int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
               freq[s.charAt(j)-'a']++;
               for(int k=0;k<freq.length;k++) {
                    if(freq[k] > 0) {
                        max = Math.max(max,freq[k]);
                        min = Math.min(min, freq[k]);
                    }
               }
                sum += (max-min);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(beautySum("xbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbbxbb"));
    }
}