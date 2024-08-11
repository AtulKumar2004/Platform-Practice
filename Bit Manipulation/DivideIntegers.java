// https://leetcode.com/problems/divide-two-integers/description/

public class DivideIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;
        boolean sign = true;
        if ((dividend >= 0 && divisor < 0) || (dividend <= 0 && divisor > 0))
            sign = false;

        if ((dividend == Integer.MIN_VALUE) && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if ((dividend == Integer.MIN_VALUE) && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        if (dividend == Integer.MAX_VALUE && divisor == Integer.MIN_VALUE)
            return 0;
        long divid = (dividend >= 0) ? dividend : -dividend;
        long divis = (divisor > 0) ? divisor : -divisor;
        if (divid == Integer.MIN_VALUE)
            divid = Integer.MAX_VALUE;
        if (divis == Integer.MIN_VALUE)
            divis = Integer.MAX_VALUE;
        long quotient = 0;
        if (divid < divis)
            return 0;

        while (divid >= divis) {
            int count = 0;
            while (divid >= (divis << (count + 1))) {
                count++;
            }
            quotient += (1 << count);
            divid -= (divis << count);
        }

        if (dividend == Integer.MIN_VALUE && !sign && (divisor == 2 || divisor == 4))
            quotient++;
        return sign ? (int) quotient : (int) -quotient;

    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 2));
    }
}
