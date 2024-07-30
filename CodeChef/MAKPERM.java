/* Link - https://www.codechef.com/problems/MAKPERM */

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
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            for(int i=1; i<=n; i++) hs.add(i);
            for(int i=0; i<n; i++) hs.remove(sc.nextInt());
            System.out.println(hs.size());
        }
	}
}
