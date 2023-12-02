/* Link - https://www.codechef.com/problems/TIDRICE/ */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            HashMap<String,Character> hm = new HashMap<>();
            for(int j=0;j<n;j++){
                hm.put(sc.next(),sc.next().charAt(0));
            }
            int score=0;
            for(String key:hm.keySet()){
                if(hm.get(key)=='+'){
                    score = score + 1;
                }
                else if(hm.get(key)=='-'){
                    score = score -1;
                }
            }
            System.out.println(score);
        }
	}
}
