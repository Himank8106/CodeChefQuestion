/* Link - https://www.codechef.com/problems/CHEFROUT */

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
            String s = sc.next();
            int a = 0;
            for(int i=0; i<s.length()-1; i++){
                if((s.charAt(i)=='E' && s.charAt(i+1)=='C') || (s.charAt(i)=='S' && (s.charAt(i+1)=='E' || s.charAt(i+1)=='C'))){
                    a=1;
                    break;
                }
            }
            if(a==0) System.out.println("yes");
            else System.out.println("no");
        }
	}
}
