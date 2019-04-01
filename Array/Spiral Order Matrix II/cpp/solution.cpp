vector<vector<int> > Solution::generateMatrix(int n) {

    int left =0, top =0, bottom = n-1, right = n-1; 
        vector<vector<int>> arr(n,vector<int>(n));  
        int val =1; 
        //simulate the sprial traversing 
        while(1){
            for(int i=left;i<=right;i++){
                arr[top][i] = val++; 
            }
            top++; 
            if(top > bottom) break; 
            for(int i=top;i<=bottom;i++){
                arr[i][right] = val++; 
            }
            right--; 
            
            if(left > right )break; 
            
            for(int i=right; i>=left; i--){
                arr[bottom][i] = val++; 
            }
            bottom--; 
            if(bottom < top ) break; 
            for(int i=bottom;i>=top;i--){
                arr[i][left] = val++; 
            }
            left++; 
            if(left> right) break; 
        }
        return arr; 
}
