public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProduct(final List<Integer> A) {
        int minValue = A.get(0);
        int maxValue = A.get(0);
        int maxProd = A.get(0);
        for(int i=1;i<A.size();i++) {
            if(A.get(i)<0) {
                int temp = minValue;
                minValue = maxValue;
                maxValue = temp;
            }
            maxValue = Math.max(A.get(i), maxValue*A.get(i));
            minValue = Math.min(A.get(i), minValue*A.get(i));
            maxProd = Math.max(maxProd, maxValue);
        }
        return maxProd;
    }
}
