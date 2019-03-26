public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        String str = A.replaceAll("\\s{2,}"," ");
        String[] tokens = str.split(" ");
        if(tokens.length==0)
            return 0;
        String lastWord = tokens[tokens.length-1];
        return lastWord.length();
    }
}
