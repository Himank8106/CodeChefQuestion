/* Link - https://www.codechef.com/problems/GAME_XI */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            long ans = 0;
            int[] bat = new int[n], bowl = new int[m];
            for(int i=0; i<n; i++){
                bat[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                bowl[i] = sc.nextInt();
            }
            if(m<4 || n<4 || m+n<11){
                System.out.println(-1);
            }
            else{
                Arrays.sort(bat);
                Arrays.sort(bowl);
                for(int i = 0; i < 4; i++) {
                    ans += bat[n-1-i];
                    ans += bowl[m-1-i];
                }
    
                int i = n - 5, j = m - 5, remaining = 3;
                while (remaining-- > 0 && (i >= 0 || j >= 0)) {
                    if (i >= 0 && (j < 0 || bat[i] > bowl[j])) {
                        ans += bat[i--];
                    } else {
                        ans += bowl[j--];
                    }
                }
    
                if (remaining > 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(ans);
                }
            }
        }
	}
}
