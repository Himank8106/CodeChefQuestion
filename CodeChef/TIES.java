/* Link - https://www.codechef.com/problems/TIES */

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
            int n = sc.nextInt(), sum=0, flag=0;
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int a = sum/n;
            if(a*n != sum) System.out.println("No");
            else{
                for(int i=0; i<n; i++){
                    if(Math.abs(arr[i]-a)%2 != 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }
        }
	}
}
