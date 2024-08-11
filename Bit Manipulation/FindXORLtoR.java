// https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-xor-of-numbers-from-l-to-r

public class FindXORLtoR {
    public static int findXOR(int N) {
        if(N%4 == 1) return 1;
        else if(N%4 == 2) return N+1;
        else if(N%4 == 3) return 0;
        else return N;
    }
    public static int findXOR(int l, int r) {
        return findXOR(l-1) ^ findXOR(r);
    }
}