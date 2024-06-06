/* Link - https://www.codechef.com/problems/LEXOPAL */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String solve(char []a){
        int i=0;
        int j=a.length-1;
        char c='a';
        while(i<=j){
            if(a[i]== '.' && a[j]!='.'){
                a[i] = a[j];
            }
            else if(a[j] == '.' && a[i]!='.'){
                a[j] = a[i];
            }
            else if(a[i] == '.' && a[j] == '.'){
                a[i] = 'a';
                a[j] = 'a';
            }
            else if(a[i]!='.' && a[j]!='.' && a[i]!=a[j]){
                return "-1";
            }
            i++;
            j--;
        }
        return new String(a);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int T=0;
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for(int p=0; p<T; p++){
		    String s = scan.next();
		    char[] arr = s.toCharArray();
		    System.out.println(solve(arr));
		}
	}
}
