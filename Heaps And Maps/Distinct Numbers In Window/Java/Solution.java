public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        int dist_count = 0;
        for(int i=0;i<B;i++) {
            if(hashmap.containsKey(A.get(i)))
                hashmap.put(A.get(i), hashmap.get(A.get(i))+1);
            else {
                hashmap.put(A.get(i),1);
                dist_count++;
            }
        }
        returnList.add(dist_count);
        for(int i=B;i<A.size();i++) {
            if(hashmap.get(A.get(i-B))==1) {
                hashmap.remove(A.get(i-B));
                dist_count--;
            }
            else {
                hashmap.put(A.get(i-B), hashmap.get(A.get(i-B))-1);
            }
            if(hashmap.containsKey(A.get(i))) {
                hashmap.put(A.get(i), hashmap.get(A.get(i))+1);
            }
            else {
                dist_count++;
                hashmap.put(A.get(i), 1);
            }
            returnList.add(dist_count);
            
        }
        return returnList;
    }
}
