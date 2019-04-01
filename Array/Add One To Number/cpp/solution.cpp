vector<int> Solution::plusOne(vector<int> &A) {
    int start_ind =0; 
    while(A[start_ind] ==0)start_ind++;  // skip the zeroes 
    int carry = 1;                       // the sum to add 
    for(int i = A.size()-1; i>=start_ind;i--){
        int sum = A[i]+carry; 
        A[i] = sum %10; 
        carry = sum/10; 
    }
    vector<int> ans;    
    if(carry)                   // check for carry, insert it first, followed by the remaining values 
        ans.push_back(carry); 
    for(int i=start_ind;i<A.size();i++)
        ans.push_back(A[i]); 
    return ans; 
        
}