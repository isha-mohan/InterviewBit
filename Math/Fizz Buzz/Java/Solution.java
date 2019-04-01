public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> finalList = new ArrayList<String>();
        for(int i=1;i<=A;i++) {
            if(i%3==0&&i%5==0)
                finalList.add("FizzBuzz");
            else if(i%3==0)
                finalList.add("Fizz");
            else if(i%5==0)
                finalList.add("Buzz");
            else
                finalList.add(Integer.toString(i));
        }
        return finalList;
    }
}
