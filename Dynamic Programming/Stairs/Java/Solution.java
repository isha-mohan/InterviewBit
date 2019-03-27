public class Solution {
    public int climbStairs(int A) {
        int[] dp = new int[A+1];
        if(A==0)
            return 1;
        if(A==1)
            return 1;
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<A+1;i++)
            dp[i] = dp[i-1]+dp[i-2];
        return dp[A];
    }
}
