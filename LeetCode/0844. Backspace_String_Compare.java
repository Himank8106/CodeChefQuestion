/* Link - https://leetcode.com/problems/backspace-string-compare/ */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        s=findback(s);
        t=findback(t);

        return s.equals(t);
    
    }
    private String findback(String s){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                count++;
            }
            else if(count!=0){
                count--;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}


/* 
Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!stack1.isEmpty() && c =='#') stack1.pop();
            else{
                if(c!='#') 
                    stack1.push(c);

             }
        }
        for(int i=0;i<t.length();i++){
            char d= t.charAt(i);
            if(!stack2.isEmpty() && d=='#') stack2.pop();
           else{
                if(d!='#') 
                    stack2.push(d);

             }
        }
        return stack1.equals(stack2);
*/

/* 
ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(!al1.isEmpty()){
                    al1.remove(al1.size()-1);
                }
            }
            else{
                al1.add(s.charAt(i));
            }
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(!al2.isEmpty()){
                    al2.remove(al2.size()-1);
                }
            }
            else{
                al2.add(t.charAt(i));
            }
        }
        return al1.equals(al2);
*/
