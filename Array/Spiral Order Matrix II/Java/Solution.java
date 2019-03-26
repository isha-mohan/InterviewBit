public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] matrix = new int[A][A];
        int last_row = A-1;
        int last_col = A-1;
        int count = 1;
        int k = 0, l = 0;
        while(k<=last_row && l<=last_col) {
            //Block 1
            for(int i=l;i<=last_col;i++) {
                matrix[k][i] = count++;
            }
            k++;
            //Block 2
            for(int i=k;i<=last_row;i++) {
                matrix[i][last_col] = count++;
            }
            last_col--;
            //Block 3
            if(k <= last_row) {
                for(int i=last_col;i>=l;i--) {
                    matrix[last_row][i] = count++;
                }
                last_row--;
            }
            //Block 4
            if(l <= last_col) {
                for(int i=last_row;i>=k;i--) {
                    matrix[i][l] = count++;
                }
                l++;
            }
        }
        return matrix;
    }
}
