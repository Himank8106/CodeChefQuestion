class Solution {

    private int op(int n, int k){ return k *(n/k)*(n/k+1)/2;}

    public int sumOfMultiples(int n) {
        return op(n, 3) + op(n, 5) + op(n, 7) - op(n, 3*5) - op(n, 3*7) - op(n, 5*7) 
        + op(n, 3 * 5 * 7);
    }
}

/*
        int ans = 0;
        for(int i=3; i<=n; i++){
            if(i%3==0 || i%5==0 ||i%7==0){
                ans += i;
            }
        }
        return ans;
*/
