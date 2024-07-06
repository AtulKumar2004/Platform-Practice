// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/0

import java.util.*;

public class Union {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            while ((i + 1) < n && arr1[i] == arr1[i + 1]) {
                i++;
            }
            while ((j + 1) < m && arr2[j] == arr2[j + 1]) {
                j++;
            }
            if (arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            } else if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;

            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            while ((i + 1) < n && arr1[i] == arr1[i + 1]) {
                i++;
            }
            list.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            while ((j + 1) < m && arr2[j] == arr2[j + 1]) {
                j++;
            }
            list.add(arr2[j]);
            j++;
        }
        return list;
    }
}
