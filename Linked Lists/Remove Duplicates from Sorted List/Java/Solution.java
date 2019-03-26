/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode temp1 = A;
        if(A.next == null)
            return A;
        ListNode temp2 = A.next;
        while(temp2!=null) {
            if(temp1.val==temp2.val) {
                temp1.next = temp2.next;
                temp2 = temp2.next;
            }
            else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return A;
    }
}
