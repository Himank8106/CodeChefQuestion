/* Link - https://www.codechef.com/problems/PROBDIFF */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++) {
        	int[] arr=new int[4];
        	for(int j=0;j<4;j++) {
        		arr[j]=scanner.nextInt();
        	}
        	Arrays.sort(arr);
        		if((arr[1]!=arr[2])||(arr[1]==arr[2] && arr[2]!=arr[3] && arr[0]!=arr[1])){
        			System.out.println(2);
        		}
        		else if(arr[0]==arr[3]) {
        			System.out.println(0);
        		}
        		else {
        			System.out.println(1);
        		}
        	
        	
        }
	}
}
