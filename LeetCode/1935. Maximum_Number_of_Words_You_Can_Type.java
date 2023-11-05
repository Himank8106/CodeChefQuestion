/* Link - https://leetcode.com/problems/maximum-number-of-words-you-can-type/ */

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count =0;
        char arr[] = brokenLetters.toCharArray();
        int broken[] = new int[128];
        for(int c: arr){
            broken[c]++;
        }
        boolean flag = true;
        for(char c : text.toCharArray()){
            if(c == ' '){
                if(flag) count++;
                flag = true;
                continue;
            }
            if(flag)
            flag  = broken[c] == 0;
        }
        if(flag) count++;
        return count;
    }
}


/* 
String[] temp= text.split(" ");
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            char c= brokenLetters.charAt(i);
            for(int j=0;j<temp.length;j++){
                
                if(temp[j].contains(Character.toString(c))) set.add(j);
            }
        }
        return temp.length-set.size();
*/
