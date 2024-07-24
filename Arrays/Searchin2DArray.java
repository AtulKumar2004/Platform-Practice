// https://leetcode.com/problems/search-a-2d-matrix/description/

public class Searchin2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n = matrix[0].length;
        if(m == 1 && n == 1 && target == matrix[0][0]) return true;
        else if(m == 1 && n == 1 && target != matrix[0][0]) return false;
        int start = 0;
        int end = m*n - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int row = (mid/n);
            int col = (mid%n);
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] < target) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
}
