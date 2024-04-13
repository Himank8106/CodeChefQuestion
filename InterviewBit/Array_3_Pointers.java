int Solution::minimize(const vector<int> &arr1, const vector<int> &arr2, const vector<int> &arr3) {
    if ( arr1.size() < 0 || arr2.size() < 0 || arr3.size() < 0) { return -1; }
    int i = 0;
    int j = 0 ;
    int k = 0;
    long long ans = INT_MAX;
    while ( (i < arr1.size()) && ( j < arr2.size() ) && ( k < arr3.size())) {
        long long maxi = max( {arr1[i], arr2[j], arr3[k]});
        long long mini = min( { arr1[i], arr2[j], arr3[k]});
        if ( arr1[i] == mini) { i++; }
        else if ( arr2[j] == mini) { j++;}
        else { k++; }
        ans = min( maxi - mini, ans);
    }
    return ans;
}
