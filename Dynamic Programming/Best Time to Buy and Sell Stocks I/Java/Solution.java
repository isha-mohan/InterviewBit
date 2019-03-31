public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        if(A.size()==0)
            return 0;
        int min = A.get(0);
        int max_profit = 0;
        for(int i=1;i<A.size();i++) {
            if(A.get(i)<min) {
                min = A.get(i); 
            }
            else {
                max_profit = Math.max(max_profit, A.get(i)-min);
            }
        }
        return max_profit;
    }
}
