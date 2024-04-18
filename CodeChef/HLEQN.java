/* Link - https://www.codechef.com/problems/HLEQN */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int x = in.nextInt();
            if(x<5){
                System.out.println("no");
            }
            else{
                int a = 0;
                for(int i = 1;i<Math.sqrt(x);i++){
                    if((x-(2*i))%(2+i)==0){
                        System.out.println("yes");
                         a = 1;
                        break;
                    }
                }
                if(a==0){
                    System.out.println("no");
                }

            }
         }

	}
}
