public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> A) {
        int[] lis = new int[A.size()];
        int max = 1;
        Arrays.fill(lis,1);
        for(int i=1;i<A.size();i++) {
            for(int j=0;j<i;j++) {
                if(A.get(i)>A.get(j)) {
                    lis[i] = Math.max(lis[i], lis[j]+1);
                    max = Math.max(max, lis[i]);  
                }
            }
        }
        return max;
    }
}
