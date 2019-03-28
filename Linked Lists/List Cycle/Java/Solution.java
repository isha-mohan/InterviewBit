/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        Set<ListNode> hashSet = new HashSet<ListNode>();
        ListNode temp = a;
        boolean flag = true;
        while(temp!=null) {
            if(hashSet.contains(temp)) {
                return temp;
            }
            else {
                hashSet.add(temp);
            }
            temp = temp.next;
        }
        return null;
    }
}
