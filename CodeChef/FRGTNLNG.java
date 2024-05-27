/* Link - https://www.codechef.com/problems/FRGTNLNG */

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
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    String b[]=new String[n];
		    for(int i=0;i<n;i++)
		    b[i]=sc.next();
		     int ar[]=new int[n];
		    while(k-->0){
		        int l=sc.nextInt();
		        String a[]=new String[l];
		        for(int i=0;i<l;i++){
		        a[i]=sc.next();
		        }
		       
		        for(int i=0;i<n;i++){
		            for(int j=0;j<l;j++){
		                if(b[i].equals(a[j]))
		                ar[i]++;
		            }
		        }
		}
		        for(int i=0;i<n;i++){
		            if(ar[i]>0)
		            System.out.print("YES"+" ");
		                else System.out.print("NO"+" ");
		        }
		        System.out.println();
		}

	}
}
