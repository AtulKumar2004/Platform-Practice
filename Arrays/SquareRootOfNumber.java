// https://www.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root

public class SquareRootOfNumber {
    long floorSqrt(long x)
	 {
		long start = 1;
		long end = x;
		long ans = -1;
		
		while(start <= end) {
		    long mid = (start + end) / 2;
		    if(mid*mid <= x) {
		        ans = mid;
		        start = mid+1;
		    } else {
		        end = mid-1;
		    }
		}
		return ans;
	 }
}
