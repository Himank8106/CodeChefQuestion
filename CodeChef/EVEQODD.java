/* Link - https://www.codechef.com/problems/EVEQODD */

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
            int n = sc.nextInt(), even=0, odd=0;
            int[] arr = new int[2*n];
            for(int i=0; i<2*n; i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0) even++;
                else odd++;
            }
            if(even==odd) System.out.println(0);
            else if(odd>n) System.out.println(Math.abs(n-odd));
            else{
                List<Integer> al = new ArrayList<>();
                int c = 0, ans=0;
                for(int i: arr){
                    if(i%2==0){
                        while(i%2==0){
                            i /= 2;
                            c++;
                        }
                        al.add(c);
                        c=0;
                    }
                }
                Collections.sort(al);
                for(int i=0; i<n-odd; i++){
                    ans += al.get(i);
                }
                System.out.println(ans);
            }
        }
	}
}
