/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
ListNode* Solution::deleteDuplicates(ListNode* A) {
    ListNode* curr = A;
    ListNode* ans = curr;  // head pointer, as head is guaranteed to be in the answer 
    while(curr and curr->next){
        if(curr->val == curr->next->val ){   // duplicate value found, skip them 
            curr->next = curr->next->next; 
        }else{
            curr=curr->next;            
        }
    }
    return ans; 
}
