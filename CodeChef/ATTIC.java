/* Link - https://www.codechef.com/problems/ATTIC */

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
            int count=0, max=0, stop=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='#'){
                    count = 0;
                }
                else if(s.charAt(i)=='.' && s.charAt(i+1)=='#'){
                    count++;
                    if(count>max){
                        max = count;
                        stop++;
                    }
                }
                else{
                    count++;
                }
            }
            System.out.println(stop);
        }
	}
}
