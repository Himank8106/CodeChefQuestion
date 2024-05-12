/* Link - https://www.interviewbit.com/problems/4-sum/ */

vector<vector<int> > Solution::fourSum(vector<int> &A, int target) {
    sort(A.begin(),A.end());
    set<vector<int>>ans;
    for(int i=0;i<A.size();i++){
        for(int j=i+1;j<A.size();j++){
            for(int k=j+1;k<A.size();k++){
                int sum = A[i]+A[j]+A[k];
                int tar = target -sum;
                if(binary_search(A.begin()+k+1, A.end(), tar))ans.insert({A[i],A[j],A[k],tar});
            }
        }
    }
    return vector<vector<int>>(ans.begin(), ans.end());
}
