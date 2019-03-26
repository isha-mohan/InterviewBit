public class Solution {
    public int isPalindrome(String A) {
        A = A.replaceAll("[^a-zA-Z0-9]","");
        A = A.toLowerCase();
        int start = 0;
        int end = A.length()-1;
        while(start<end) {
            if(A.charAt(start)!=A.charAt(end))
                return 0;
            start++;
            end--;
        }
        return 1;
    }
}
