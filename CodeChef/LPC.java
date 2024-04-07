/* Link - https://www.codechef.com/problems/LPC */
  
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            String k = sc.next();
            
            int minMoves = Integer.MAX_VALUE;
            
            
            for (int i = 0; i <= n - m; i++) {
                int moves = 0;
                
                
                for (int j = 0; j < m; j++) {
                    int digitS = s.charAt(i + j) - '0'; 
                    int digitK = k.charAt(j) - '0';
                    moves += Math.min(Math.abs(digitS - digitK), 10 - Math.abs(digitS - digitK));
                }
                minMoves = Math.min(minMoves, moves);
            }
            
            System.out.println(minMoves);
        }
    }
}
