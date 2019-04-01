vector<int> Solution::maxset(vector<int> &A) {
    int start =0; 
    int end =0; 
    int len = A.size(); 
    long long currSum =0; 
    long long maxSum =0;
    int maxStart =0; 
    int maxEnd =0; 
    while(end < len){
        if(A[end] >= 0){
            currSum += A[end]; 
            if(currSum > maxSum ){
                maxSum = currSum; 
                maxEnd = end+1; 
                maxStart = start; 
            }else if(currSum == maxSum){
                if(end-start+1 > maxEnd - maxStart){  // update based on the length, smaller index is already taken care of 
                    maxStart = start; 
                    maxEnd = end+1; 
                }
            }
        }else{
            currSum =0; 
            start = end+1; 
        }
        end++; 
    }
    vector<int> ans; 
    for(int i = maxStart; i<maxEnd;i++){
        ans.push_back(A[i]); 
    }
    return ans;
}

