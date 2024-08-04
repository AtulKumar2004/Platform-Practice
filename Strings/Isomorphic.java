// https://leetcode.com/problems/isomorphic-strings/description/

import java.util.HashMap;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(hm.containsKey(ch) && hm.get(ch) != t. charAt(i)) return false;
            if(!hm.keySet().isEmpty()) {
                for(char key:hm.keySet()) {
                    if(hm.get(key) == t.charAt(i)) {
                        if(key != ch) return false;
                    }
                }
            }

            hm.put(s.charAt(i),t.charAt(i));
        }
        return true;

    }
}