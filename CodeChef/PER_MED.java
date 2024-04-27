/* Link - https://www.codechef.com/problems/PER_MED */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int low = 1;
		    int high = n;
		    
		    for(int i=0; i<n; i++) {
		        System.out.print(((i % 2 == 0) ? high-- : low++) + " ");
		    }
		    
		    System.out.println();
		}
	}
}
