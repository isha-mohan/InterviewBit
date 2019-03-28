/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */


/*
 Traverse one node to the far end, keep one at the start, now check whether the values are same, only palindromes will be same. 

*/
 bool palindromeHelper(ListNode*& left,ListNode* right ){
    if(right == nullptr)
        return true; 
    bool isp1 = palindromeHelper(left,right->next);   
    bool isp2 = (left->val == right->val);
    left = left->next; 
    return isp1 and isp2; 
}
int Solution::lPalin(ListNode* A) {
    ListNode* left = A; 
    ListNode* right = A; 
    return palindromeHelper(left,right); 
}


