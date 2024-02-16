// Link - https://www.interviewbit.com/problems/maximum-unsorted-subarray

vector<int> Solution::subUnsort(vector<int> &a) {
vector<int>b(a.begin(),a.end());
sort(b.begin(),b.end());
int n=a.size(),count=0,s=-1,e=-1;
for(int i=0;i<n;i++)
{
if(a[i]!=b[i])
{
if(s==-1)
s=i;
else
e=i;
}
}
if(s==e and s==-1)
return {s};
return {s,e};
}
