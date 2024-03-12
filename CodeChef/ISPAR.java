/* Link - https://www.codechef.com/problems/ISPAR */

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
            long n = sc.nextLong(), k = sc.nextLong();
            if(k==1){
                if(n%2==0) System.out.println("EVEN");
                else System.out.println("ODD");
            }
            else if(k==2){
                System.out.println("ODD");
            }
            else{
                System.out.println("EVEN");
            }
        }
	}
}
