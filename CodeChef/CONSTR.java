/* Link - https://www.codechef.com/problems/CONSTR */

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
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                int count = 0;
                while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                    count++;
                    i++;
                }
                if((count+1)%2 ==0){
                    sb.append(s.charAt(i));
                    sb.append(s.charAt(i));
                }
                else{
                    sb.append(s.charAt(i));
                }
                count = 0;
            }
            System.out.println(sb);
        }
	}
}
