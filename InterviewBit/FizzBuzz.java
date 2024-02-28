/* Link - https://www.interviewbit.com/problems/fizzbuzz/ */

public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> arr = new ArrayList<>();
       
        for(int i=1;i<=A;i++){
            String s = "";
           
            if(i%3==0) s = "Fizz";
            if(i%5==0) s += "Buzz";
           
            arr.add((s=="")?i+"":s);    
        }
        return arr;
    }
}
