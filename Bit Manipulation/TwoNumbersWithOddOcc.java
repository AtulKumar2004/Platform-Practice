// https://www.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1

public class TwoNumbersWithOddOcc {
    public int[] twoOddNum(int Arr[], int N)
    {
        long XORR = 0;
        for(int i=0;i<Arr.length;i++) {
            XORR = XORR ^ Arr[i];
        }
        long rightmost = ((XORR & XORR-1) ^ XORR);
        long b1=0,b2=0;
        for(int i=0;i<Arr.length;i++) {
            if((rightmost & Arr[i]) != 0) {
                b1 = b1 ^ Arr[i];
            } else {
                b2 = b2 ^ Arr[i];
            }
        }
        if(b1 > b2) return new int[] {(int)b1,(int)b2};
        else return new int[] {(int)b2,(int)b1};
    }
}
