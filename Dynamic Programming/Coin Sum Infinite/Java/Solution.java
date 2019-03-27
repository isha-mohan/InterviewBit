public class Solution {
    public int coinchange2(ArrayList<Integer> A, int B) {
        int[] dp = new int[B+1];
        dp[0] = 1;
        for(int i=1;i<B+1;i++)
            dp[i] = 0;
        for(int i=0;i<A.size();i++) {
            for(int j=0;j<B+1;j++) {
                if(j>=A.get(i)) {
                    dp[j] = dp[j] + dp[j-A.get(i)];
                    dp[j] = dp[j]%1000007;
                }
            }
        }
        return dp[B];
    }
}
