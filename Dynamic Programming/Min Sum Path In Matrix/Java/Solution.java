public class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();
        int[][] dp = new int[row][col];
        dp[0][0] = A.get(0).get(0);
        for(int i=1;i<col;i++) {
            dp[0][i] = dp[0][i-1] + A.get(0).get(i);
        }
        for(int i=1;i<row;i++) {
            dp[i][0] = dp[i-1][0] + A.get(i).get(0);
        }
        for(int i=1;i<row;i++) {
            for(int j=1;j<col;j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + A.get(i).get(j);
            }
        }
        return dp[row-1][col-1];
    }
}
