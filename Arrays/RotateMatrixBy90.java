// https://leetcode.com/problems/rotate-image/description/

public class RotateMatrixBy90 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<=n-2;i++) {
            for(int j=i+1;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                int temp = matrix[i][n-j-1];
                matrix[i][n-j-1] = matrix[i][j];
                matrix[i][j] = temp;
            }            
        }
    }
}
