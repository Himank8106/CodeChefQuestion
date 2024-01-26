/* Link - https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/0 */

//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n){
	    //add code here.
	    for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i])) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        int left = 0;
        int right = numStr.length() - 1;
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
