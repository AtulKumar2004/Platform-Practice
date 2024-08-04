// https://leetcode.com/problems/rotate-string/description/

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        // StringBuilder sb = new StringBuilder(s);
        // for(int i=0;i<sb.length();i++) {
        //     char ch = sb.charAt(0);
        //     sb.replace(0,sb.length()-1,sb.substring(1));
        //     sb.setCharAt(sb.length()-1, ch);
        //     if(sb.toString().equals(goal)) return true;
        // }
        // return false;

        return s.length() == goal.length() && (s + s).contains(goal);
    }
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
}
