// https://leetcode.com/problems/string-to-integer-atoi/description/

public class Atoi {
    public static int myAtoi(String s) {
        if(s.equals("")) return 0;
        StringBuilder sb = new StringBuilder("");
        int c=1,ind=-1;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '-' || ch == '+') {
                ind=i;
                if(ch == '-') c=0;
                break;
            }
            else if(ch != ' ') {
                ind=i;
                break;
            }
        }
        if(ind == -1) return 0;
        for(int i=ind;i<s.length();i++) {
            char ch = s.charAt(i);
            if(i == ind && ch == '-') sb.append('-');
            else if(ch == '+' && i == ind) continue;
            else if(Character.isDigit(ch)) {
                sb.append(ch);
            }
            else{
                break;
            }
        }
        if(sb.toString().equals("") || sb.toString().equals("-")) return 0; 
        try {
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            if(sb.toString().charAt(0) == '-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("95341355555"));
    }
}
