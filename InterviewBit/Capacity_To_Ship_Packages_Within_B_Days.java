/* Link - https://www.interviewbit.com/problems/capacity-to-ship-packages-within-b-days/ */

bool checkwt(int mid, vector<int>&arr, int b)
{
    int days=0;
    int wt=0;
    for(int i=0; i<arr.size(); i++)
    {
        if(wt+arr[i]<=mid)
            wt+=arr[i];

        else{
            days++;
            if(days>=b || arr[i]>mid) return false;
            wt=arr[i];
        }
    }
   
    return true;
}

int Solution::solve(vector<int> &A, int B) {
    int maxwt= 0;
    for(auto i: A)  maxwt+=i;
   
    int i=0, j=maxwt, ans=0;
    while(i<=j)
    {
        int mid= i+(j-i)/2;
       
        if(checkwt(mid,A,B))
        {
            ans= mid;
            j=mid-1;
        }
        else
            i=mid+1;
    }
   
    return ans;
}
