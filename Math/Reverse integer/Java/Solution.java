public class Solution {
    public int reverse(int A) {
        boolean isNegative = false;
        if(A<0)
            isNegative = true;
        A = Math.abs(A);
        int prev_num = 0, rev_num = 0;
        while(A>0) {
            int curr_digit = A%10;
            rev_num = (rev_num*10)+curr_digit;
            if((rev_num-curr_digit)/10!=prev_num)
                return 0;
            prev_num = rev_num;
            A = A/10;
        }
        if(isNegative)
            return rev_num*-1;
        return rev_num;
    }
}
