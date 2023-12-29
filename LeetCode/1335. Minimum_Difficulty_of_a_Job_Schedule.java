/* Link - https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/ */

class Solution {
    public int maxa(int a,int b){
        if(a>b)return b;
        return a;
    }
    public int minDifficul(int[] job, int d,int[][] dp,int[][] maxvi, int n,int ma){
        int l=ma;
        if(n==0 &&d==1) return Math.max(ma,job[0]);
        if(dp[n][d]!=-1 && maxvi[n][d]==ma)return dp[n][d];
        int ans;
        if(d==1){
            if(ma<job[n])ma=job[n];
            for(int i=0;i<n;i++){
               if(ma<job[i]) ma = job[i];
            }
            ans= ma;
        }else if(n>=d){
            if(ma<job[n]){
                ma=job[n];
                }
        ans=maxa(ma + minDifficul(job,d-1,dp,maxvi,n-1,-1),minDifficul(job, d,dp,maxvi, n-1,ma)); 
        }else{     
            if(ma<job[n])ma=job[n];
            for(int i=0;i<n;i++){
                ma =ma+job[i];
            }
            ans= ma;
        }
        maxvi[n][d]=l;
        return dp[n][d]=ans;
    }
    
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(n<d)return -1;
        if(n==d){
            int s=0;
            for(int p: jobDifficulty){
               s +=p; 
            }
            return s;
        }
        int[][] dp=new int[n][d+1];
        for(int[] v:dp) {
            Arrays.fill(v,-1);
        }
        int[][] maxvi=new int[n][d+1];
        for(int[] v:maxvi) {
            Arrays.fill(v,-1);
        }
        
        return minDifficul(jobDifficulty,  d,dp,maxvi, n-1,-1);
    }
}
