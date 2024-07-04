/* Link - https://www.codechef.com/problems/LOSTSEQ */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();;
        while(t-->0){
            int n = sc.nextInt(), even=0, odd=0;
            int[] arr = new int[2*n];
            for(int i=0; i<2*n; i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0) even++;
                else odd++;
            }
            if(odd%2==0 && even%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
	}
}
