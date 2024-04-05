/* Link - https://www.codechef.com/problems/CHEFGRD */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int c = (n+1);
            int a = x+y;
            if ((a%2 == 0 && c%2 == 0) || (a%2 != 0 && c%2 != 0)){
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
	}
}
