// https://leetcode.com/problems/set-matrix-zeroes/description/

import java.util.*;
public class MatrixZeroes {
    public static void setZeroes(int[][] matrix) { // TC- O(mn)
        int m=matrix.length;
        int n=matrix[0].length;

        // SC-O(m+n)
        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i=0;i<m;i++) {
        //     for(int j=0;j<n;j++) {
        //         if(matrix[i][j] == 0) {
        //             list.add(i);
        //             list.add(j);
        //         }
        //     }
        // }

        // for(int i=0;i<list.size()-1;i+=2) {
        //     for(int j=0;j<m;j++) {
        //         if(matrix[j][list.get(i+1)] != 0) {
        //             matrix[j][list.get(i+1)] = 0;
        //         }
        //     }
        //     for(int j=0;j<n;j++) {
        //         if(matrix[list.get(i)][j] != 0) {
        //             matrix[list.get(i)][j] = 0;
        //         }
        //     }
        // }


        // SC - O(1)
        boolean fr = false,fc = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(fc) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println();
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}