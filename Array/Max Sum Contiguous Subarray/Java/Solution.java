public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int length = A.length;
        int max_so_far = A[0];
        int curr_max = A[0];
        for(int i=1;i<length;i++) {
            curr_max = Math.max(curr_max+A[i], A[i]);
            max_so_far = Math.max(curr_max, max_so_far);
        }
        return max_so_far;
    }
}
