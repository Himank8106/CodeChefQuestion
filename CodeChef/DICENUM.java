/* Link - https://www.codechef.com/START103D/problems/DICENUM */

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
		int t = sc.nextInt();
		while(t-->0){
		    int[] arr1 = new int[3];
		    int[] arr2 = new int[3];
		    for(int i=0; i<3; i++){
		        arr1[i] = sc.nextInt();
		    }
		    for(int i=0; i<3; i++){
		        arr2[i] = sc.nextInt();
		    }
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    if((arr1[2]*100+arr1[1]*10+arr1[0])>(arr2[2]*100+arr2[1]*10+arr2[0])){
		        System.out.println("Alice");
		    }
		    else if((arr1[2]*100+arr1[1]*10+arr1[0])<(arr2[2]*100+arr2[1]*10+arr2[0])){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Tie");
		    }
		}
	}
}
