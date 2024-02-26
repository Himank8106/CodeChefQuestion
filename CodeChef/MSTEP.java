/* Link - https://www.codechef.com/problems/MSTEP */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        long testCases = Integer.parseInt(br.readLine());
        int r,c;
        int i;
        while(--testCases>=0){
            int N = Integer.parseInt(br.readLine());
            int[][] myMatrix = new int[N+1][N+1];
            
            int[] row = new int[N*N+1];
            int[] col = new int[N*N+1];

            for(r=1;r<=N;r++){
                String[] rowStr = br.readLine().split(" ");
                    for(c=1;c<=N;c++){
                        myMatrix[r][c] = Integer.parseInt(rowStr[c-1]);
                        row[myMatrix[r][c]] = r;
                        col[myMatrix[r][c]] = c;
                    }
            }
            int step = 0;
            for(i=2;i<=N*N;i++){
                step += Math.abs(row[i]-row[i-1]) + Math.abs(col[i] - col[i-1]);
            }
            System.out.println(step);
        }
	}
}
