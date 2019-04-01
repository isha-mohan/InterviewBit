public class Solution {
    public int titleToNumber(String A) {
        int count = 0;
        int power = 0;
        StringBuilder sb = new StringBuilder("");
        sb.append(A);
        A = sb.reverse().toString();
        for(int i=0;i<A.length();i++) {
            count = count + (int)Math.pow(26,power++)*(A.charAt(i)-'A'+1);
        }
        return count;
    }
}
