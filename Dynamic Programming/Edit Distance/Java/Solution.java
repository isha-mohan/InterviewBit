public class Solution {
    public int minDistance(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();
        int[][] dp = new int[lengthA+1][lengthB+1];
        int temp = 0;
        for(int i=0;i<lengthB+1;i++)
            dp[0][i] = temp++;
        temp = 0;
        for(int i=0;i<lengthA+1;i++)
            dp[i][0] = temp++;
        for(int i=1;i<lengthA+1;i++) {
            for(int j=1;j<lengthB+1;j++) {
                if(A.charAt(i-1)==B.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else {
                    int temp1 = Math.min(dp[i-1][j], dp[i-1][j-1]);
                    dp[i][j] = Math.min(temp1, dp[i][j-1])+1;
                }
            }
        }
        return dp[lengthA][lengthB];
    }
}
