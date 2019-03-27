public class Solution {
    public int numSetBits(long a) {
        int count = 0;
        while(a!=0) {
            count = count+(int)(a&1);
            a = a>>1;
        }
        return count;
    }
}
