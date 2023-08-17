/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ENDSORTED
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n,count=0,id1=0,id2=0;
		    n=sc.nextInt();
		    int p[]=new int[n];
		    for(int i=0;i<n;i++){
		        p[i]=sc.nextInt();
		    }    
		    if(p[0]==1&&p[n-1]==n)
		        count=0;
            else{
		        for (int i = 0; i < n; i++) {
                    if(p[i]==1)
                    id1=i;
                    if(p[i]==n)
                    id2=i;
                }
                if(id1<id2)
                    count=(id1-0)+(n-1-id2);
                else if(id1>id2)
                    count=(id1-0)+(n-1-id2)-1;
		    }
		    System.out.println(count);
		}
	}
}

/*
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner scn = new Scanner(System.in)) {
		    int cases = scn.nextInt();
		    
		    while(cases-- > 0) {
		        int l = scn.nextInt();
		        int nums[] = new int[l];
		        for(int i = 0; i < l; ++i) nums[i] = scn.nextInt();
		        
		        int p1 = 0;
		        int p2 = 0;
		        
		        while(nums[p1++] != 1);
		        while(nums[p2++] != l);
		        
		        int moves = p1 + (l - 1 - p2);
		        if(p1 > p2)
		            --moves;
		       
		        System.out.println(moves);
		    }
		}
	}
}
*/
