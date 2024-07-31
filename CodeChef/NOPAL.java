/* Link - https://www.codechef.com/problems/NOPAL */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    
    public static void main(String[] args) throws java.lang.Exception{

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int s = sc.nextInt();
            char ch = 'a';
            int count = 0;
            while (count != s) {
                if (ch == 'z'){
                    ch = 'a';
                }
                System.out.print(ch);
                ch++;
                count++;
            }
            System.out.println();
        }
    }
}
