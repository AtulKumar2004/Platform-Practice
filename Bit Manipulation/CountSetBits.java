public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        int orig = 1, i = 1;
        while (orig > 0 && i <= n) {
            if ((orig & 1) != 0) {
                count++;
            }
            orig = orig >> 1;
            if (orig == 0) {
                i = -~i;
                orig = i;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        System.out.println(countSetBits(4));
    }
}
