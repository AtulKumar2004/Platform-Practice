public class RemoveParenthesis {
    public String removeOuterParentheses(String s) {
        int c = 0;
        int start = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                c++;
            }
            else {
                c--;
            }
            if(c == 0) {
                sb.append(s.substring(start+1,i));
                start = i+1;
            }
        }
        return sb.toString();
    }
}
