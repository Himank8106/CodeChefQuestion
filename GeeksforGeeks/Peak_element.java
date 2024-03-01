/* Link - https://www.geeksforgeeks.org/problems/peak-element/1 */

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int start = 0;
       int end = n-1;
       while(start <= end){
           int mid = start + (end-start) / 2;
           if(start < mid && arr[mid] < arr[mid-1]) {
               end = mid - 1;
           }
           else if(mid < end && arr[mid] < arr[mid+1]) {
               start = mid + 1;
           }
           else {
                return mid;
           }
       }
       return -1;
    }
}
