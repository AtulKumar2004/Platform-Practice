public class LargestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        String str="";
        for(int i=0;i<s.length();i++) {
            StringBuilder sb = new StringBuilder("");
            for(int j=i;j<s.length();j++) {
                sb.append(s.charAt(j));
                String unreversed = sb.toString();
                if(unreversed.equals(sb.reverse().toString())) {
                    if(max < sb.length()) {
                        max = sb.length();
                        str = unreversed;
                    }
                }
                sb = new StringBuilder(unreversed);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
