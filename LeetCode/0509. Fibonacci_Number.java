/* Link - https://leetcode.com/problems/fibonacci-number/ */

class Solution {
    public int fib(int n) {
        int a = 0, b = 1, c = 0;
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution(); 
        int k = sc.nextInt();
        int r = s.fib(k); 
        System.out.println(r);
    }
}


/* 
int a=0, b=1;
        if(n==0) return a;
        else if(n==1) return b;
        else if(n==2) return a+b;
        int c=a+b;
        for(int i=2; i<n; i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
*/
