/* Link - https://www.codechef.com/problems/PERMGCD */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
		    int n = in.nextInt();
		    int x = in.nextInt();
		    
		    if(x < n){
		        System.out.println("-1");
		    }
		    else{
		        int a = x - n + 1;
		        System.out.print(a + " ");
		        for(int i = 1; i <= n; i++){
		            if(i != a){
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println();		    }
		}

	}
}
