/* Link - https://www.codechef.com/problems/MINDIST1 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();

            int st,end;
            int j=0;
            while(s.charAt(j)=='0'){
                j++;
            }
            st=end=j;
            j++;
            int min = Integer.MAX_VALUE;
            for (int i = j; i < n; i++) {
                if (s.charAt(i)=='1'){
                    end=i;
                    if ((end-st)%2 == 0){
                        min = Math.min(min,2);
                    }else{
                        min = Math.min(min,1);
                    }
                    st=end;
                }
            }
            System.out.println(min);
        }
	}
}
