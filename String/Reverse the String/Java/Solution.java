public class Solution {
    public String reverseWords(String a) {
        String result = new String("");
        String[] array = a.split(" ");
        for(int i=array.length-1;i>0;i--)
        result += array[i]+" ";
        result += array[0];
        return result;
    }
}
