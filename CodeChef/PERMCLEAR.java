/* Link - https://www.codechef.com/problems/PERMCLEAR */

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
		    ArrayList<Integer> al1 = new ArrayList<>();
            ArrayList<Integer> al2 = new ArrayList<>();
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                al1.add(sc.nextInt());
            }
            int m = sc.nextInt();
            for(int i=0; i<m; i++){
                al2.add(sc.nextInt());
            }
            al1.removeAll(al2);
            for(int i=0; i<al1.size(); i++){
                System.out.print(al1.get(i)+" ");
            }
            System.out.println();
		}
	}
}
