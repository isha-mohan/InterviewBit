public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        if(A.size()==0)
            return 0;
        int[] lis = new int[A.size()];
        int[] lds = new int[A.size()];
        Arrays.fill(lis,1);
        Arrays.fill(lds,1);
        //computing LIS from left to right
        for(int i=1;i<A.size();i++) {
            for(int j=0;j<i;j++) {
                if(A.get(i)>A.get(j)) {
                    lis[i] = Math.max(lis[i], lis[j]+1);
                }
            }
        }
        //computing LDS from right to left
        for(int i=lds.length-2;i>=0;i--) {
            for(int j=lds.length-1;j>i;j--) {
                if(A.get(i)>A.get(j)) {
                    lds[i] = Math.max(lds[i], lds[j]+1);
                }
            }
        }
        int max = lis[0]+lds[0]-1;
        for(int i=1;i<lis.length;i++) {
            max = Math.max(max, lis[i]+lds[i]-1);
        }
        return max;
    }
}
