/* Link - https://www.interviewbit.com/problems/valid-bst-from-preorder/ */

vector<int> findNearestGreaterToRight(vector<int>&v){
    int n =v.size();
    stack<int>st ;
    vector<int>ans;
    for(int i = n-1 ; i >= 0; i--){
        if(st.size()==0){
            ans.push_back(-1);
        }else{
            if(v[st.top()]>v[i]){
                ans.push_back(st.top());
            }else{
                while(st.size()>0 and v[st.top()] <= v[i]){
                    st.pop();
                }
                if(st.size()==0){
                    ans.push_back(-1);
                }else{
                    ans.push_back(st.top());
                }
            }
        }
        st.push(i);
    }
    reverse(ans.begin(), ans.end());
    return ans ;
}
vector<int> findSuffMin(vector<int>&v){
    int n =v.size();
    vector<int>ans(n, v[n-1]);
    for(int i = n-2 ; i >= 0; i--){
        ans[i] = min(ans[i+1], v[i]);
    }
    return ans ;
}
bool hasDuplicate(vector<int>&v){
    sort(v.begin(), v.end());
    int vs = v.size();
    for(int i = 1; i < vs ;i++){
        if(v[i]==v[i-1]){
            return true ;
        }
    }
    return false ;
}
int Solution::solve(vector<int> &A) {
    // Nearest greater to right
    int n =A.size();
    vector<int>ngtr  = findNearestGreaterToRight(A);
    vector<int>suff = findSuffMin(A);
   
    for(int i = 0; i < n ; i++){
        int ind = ngtr[i];
        if(ind!=-1){
            if(suff[ind] <= A[i]){
                // cout << i << " pe problem" << endl;
                // cout << ind << " " << suff[ind] << " " << A[i] << endl;
                return 0;
            }
        }
    }
    if(hasDuplicate(A)){
        return 0;
    }
    return 1 ;
}
