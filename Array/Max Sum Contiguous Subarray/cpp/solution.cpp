int Solution::maxSubArray(const vector<int> &A) {
    int max_so_far = A[0]; 
    int curr_max = A[0]; 
    for(int i=1; i<A.size();i++){
        curr_max = max(curr_max + A[i], A[i]); //check which one gives optimal, continuing the old sequence or starting a new one
        max_so_far = max(max_so_far,curr_max); 
    }
    return max_so_far;
}
