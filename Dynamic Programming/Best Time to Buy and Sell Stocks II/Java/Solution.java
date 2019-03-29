public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int profit = 0;
        int i = 0;
        int n = A.size();
        while(i<n-1) {
            int minima, maxima;
            //local minima
            while(i<n-1&&A.get(i)>=A.get(i+1))
                i++;
            if(i==n-1)
                break;
            minima = i++;
            //local maxima
            while(i<n&&A.get(i)>=A.get(i-1))
                i++;
            maxima = i-1;
            profit = profit+A.get(maxima)-A.get(minima);
        }
        return profit;
    }
}
