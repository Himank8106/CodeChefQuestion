/* Link - https://www.interviewbit.com/problems/equal/ */

vector<int> Solution::equal(vector <int> & A) {
    unordered_map < int, pair < int, int >> m;
    int n = A.size();
    vector <int> ans{n,n,n,n};
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (m.find(A[i] + A[j]) != m.end()) {
                int x = m[A[i] + A[j]].first, y = m[A[i] + A[j]].second;
                if (x < y && i < j && x < i && y != i && y != j) {
                    vector <int> temp = {x,y,i,j};
                    if(temp<ans) ans=temp;
                }
            }
            else m[A[i] + A[j]] = {i,j};
        }
    }
    if(ans==vector <int> {n,n,n,n}) return {};
    return ans;
}
