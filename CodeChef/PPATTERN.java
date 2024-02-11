/* Link - https://www.codechef.com/problems/PPATTERN */

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
            int[][] arr = new int[n][n];
            int c=0, num=1;
            while(num != (n*n)+1){
                for(int i=0; i<n; i++){
                    for(int j=0; j<n; j++){
                        if(i+j==c){
                            arr[i][j] = num;
                            num++;
                        }
                    }
                }
                c++;
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
        }
	}
}
