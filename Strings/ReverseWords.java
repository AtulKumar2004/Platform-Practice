public class ReverseWords {
    public String reverseWords(String s) {
        String str = s.trim();
        String ans = "";
        String temp = "";
        str = str+" ";
        int c=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                c=0;
                temp += ch;
            } else {
                c++;
                if(c == 1) ans = temp + " " + ans;
                temp = "";
            }
        }
        return ans.trim();
    }
}
