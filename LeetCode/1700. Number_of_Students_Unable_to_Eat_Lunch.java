/* Link - https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/ */

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> stud = new ArrayList<>();
        for(int i = sandwiches.length - 1 ; i>= 0 ; i--){
            stack.push(sandwiches[i]);
        }

        for(int i : students){
            stud.add(i);
        }

        int c = 0;

        while(! (stud.size() == 0) || !stack.isEmpty()){

            if(c == stud.size()){
                return c;
            }
            if(stack.peek() == stud.get(0)){
                stack.pop();
                stud.remove(0);
                c = 0;
            }else{
                int val = stud.get(0);
                stud.remove(0);
                stud.add(val);
                c++;

            }
        }

        return 0;        
    } 
}

/* 
int ones=0, zeros=0;
        for(int i: students){
            if(i==0) zeros++;
            else ones++;
        }

        for(int sand: sandwiches){
            if(sand==0){
                if(zeros==0){
                    return ones;
                }
                zeros--;
            }
            else{
                if(ones==0){
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
*/
