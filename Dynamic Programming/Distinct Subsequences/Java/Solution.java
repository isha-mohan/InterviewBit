public class Solution {
    public int numDistinct(String A, String B) {
        int m = B.length();
        int n = A.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<n+1;i++)
            dp[0][i] = 1;
        for(int j=1;j<m+1;j++)
            dp[j][0] = 0;
        for(int i=1;i<m+1;i++) {
            for(int j=1;j<n+1;j++) {
                if(A.charAt(j-1)!=B.charAt(i-1))
                    dp[i][j] = dp[i][j-1];
                else
                    dp[i][j] = dp[i][j-1]+dp[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}
