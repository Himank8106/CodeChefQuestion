/* Link - https://www.codechef.com/problems/CATFEED */

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
            boolean b = true;
            HashSet<Integer> hs = new HashSet<>();
            while(m-->0){
                int x = sc.nextInt();
                if(b){
                    if(hs.contains(x)){
                        if(hs.size()!=n) b = false;
                        else hs.clear();
                    }
                }
                hs.add(x);
            }
            if(b) System.out.println("YES");
            else System.out.println("NO");
        }
	}
}
