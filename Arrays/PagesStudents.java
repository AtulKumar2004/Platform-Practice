// https://www.naukri.com/code360/problems/allocate-books_1090540?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries&count=25&page=1&search=&sort_entity=order&sort_order=ASC&attempt_status=COMPLETED&leftPanelTabValue=PROBLEM

import java.util.ArrayList;

public class PagesStudents {
    public static int noOfStud(ArrayList<Integer> arr, int pages) {
        int stud = 1;
        int last = 0;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) + last <= pages) {
                last += arr.get(i);
            } else {
                stud++;
                last = arr.get(i);
            }
        }
        return stud;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if(m > n) return -1;
        for(int i=0;i<arr.size();i++) {
            max = Math.max(max,arr.get(i));
            sum += arr.get(i);
        }
        int start = max;
        int end = sum;
        while(start <= end) {
            int mid = (start+end)/2;
            if(noOfStud(arr,mid) > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
