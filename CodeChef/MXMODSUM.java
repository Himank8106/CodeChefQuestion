/* Link - https://www.codechef.com/problems/MXMODSUM */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            HashSet<Long> hs=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                hs.add(sc.nextLong());
            }
            ArrayList<Long> al=new ArrayList<>(hs);
            Collections.sort(al);
            long a=al.get(al.size()-1);
            long b=al.get(al.size()-2);
            long m=Math.max(a+a,Math.max(a+b+(a-b)%k,a+b+k+(b-a)%k));
            System.out.println(m);
        }
	}
}
