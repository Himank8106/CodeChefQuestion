/* Link - https://www.codechef.com/problems/PERMCREATE */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    
		    int n=sc.nextInt();
		    if(n==1){
		        System.out.println("1");
		        continue;
		    }
		    if(n<=3){
		        System.out.println("-1");
		        continue;
		    }
		    if(n==4){
		        System.out.println("3"+" "+" 1"+" "+"4"+" "+"2");
		        continue;
		    }
		    if(n==5){
		        System.out.println("3"+" "+"1"+" "+"5"+" "+"2"+" "+"4");
		        continue;
		    }
		    
		    
		    ArrayList<Integer>list=new ArrayList<>();
		    
		    int a=n;
		    
		    if(n%2==1){
		      a=n-1;  
		    }
		    int p=a/2;
		    int j=p+1;
		    int i=1;
		    while(i<=p){
		       list.add(i);
		       list.add(j);
		       i++;
		       j++;
		    }
		    
		    if(n%2==1){
		        System.out.print(n+" ");
		    }
		    
		    for(i=0;i<a;i++){
		        System.out.print(list.get(i)+" ");
		    }
		    System.out.println();
		}

	}
}
