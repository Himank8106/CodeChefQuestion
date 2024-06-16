/* Link - https://www.interviewbit.com/problems/simplify-directory-path/ */

public class Solution {
    public String simplifyPath(String A) {
        Stack<String> st = new Stack<>();
        int start, end;
        int n = A.length();
        String str;
        for(int i=0; i<n;){
            while(i<n && A.charAt(i)=='/') i++;
            start = i;
            if(i>=n) break;
            while(i<n && A.charAt(i)!='/') i++;
            str = A.substring(start,i);
            if(str.equalsIgnoreCase("..")){
                if(!st.isEmpty()) st.pop();
            } else if(!str.equalsIgnoreCase(".")){
                st.push(str);
            }
        }
        String res = "";
        if(st.isEmpty()) res = "/";
        while(!st.isEmpty()){
            res = "/"+st.pop()+res;
        }
        return res;
    }
}
