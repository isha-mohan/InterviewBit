int Solution::longestSubsequenceLength(const vector<int> &A) {
    
    if(A.size() == 0) 
        return 0; 
    
    vector<int> increasing(A.size(),1); // increasing subsequence 
    vector<int> decreasing(A.size(),1);  // decreasing subsequence 
    
    for(int i=1;i<A.size();i++){      
        for(int j=0;j<i;j++){
            if(A[j] < A[i] and increasing[j] +1  > increasing[i])
                increasing[i] = increasing[j]+1; 
        }
    }
    
    for(int i=A.size()-1; i>=0; i--){
        for(int j=A.size()-1; j>i;j--){
            if(A[j] < A[i] and decreasing[j] + 1 > decreasing[i])
                decreasing[i] = decreasing[j]+1; 
        }
    }
    
    int maxv  = INT_MIN; 
    for(int i=0; i < A.size(); i++){
        maxv = max(increasing[i] + decreasing[i]-1,maxv); // find the longest length combining both the increasing and decreasing point 
    }
    return maxv; 
}
