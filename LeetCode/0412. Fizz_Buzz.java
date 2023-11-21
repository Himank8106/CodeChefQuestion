/* Link - https://leetcode.com/problems/fizz-buzz/ */

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        int i = 1;
        while(i <= n)
        {
            if(i % 3 == 0)
            {
                if(i % 5 == 0)
                    l.add("FizzBuzz");
                else
                    l.add("Fizz");
            }
            else if(i % 5 == 0)
                l.add("Buzz");
            else
                l.add(Integer.toString(i));
            i++;
        }
        return l;
    }
}

/* 
List<String> li = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                li.add("FizzBuzz");
            }
            else if(i%3==0){
                li.add("Fizz");
            }
            else if(i%5==0){
                li.add("Buzz");
            }
            else{
                li.add(String.valueOf(i));
            }
        }
        return li;
*/
