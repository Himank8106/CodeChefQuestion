import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    long ni=Long.parseLong(br.readLine());
		    long s=0;
		    long r=ni/9;
		    s+=45*r;
		    for(int i=1;i<=(ni-9*r);i++){
		        s+=i;
		    }
		    System.out.println(s);
		}
		
	}
}
