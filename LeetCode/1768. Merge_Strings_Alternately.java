/* Link - https://leetcode.com/problems/merge-strings-alternately/ */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int little = 0;
        String res ="";
        String end = null;

        if(l1<l2) {
            little= l1;
            end = word2.substring(l1,l2);
        } else if(l1>l2) {
            little = l2;
            end = word1.substring(l2,l1);
        }
        else if(l1==l2) {
            little= l1;
        }

        for(int i = 0 ; i < little; i++) {
            res += word1.charAt(i);
            res += word2.charAt(i);
        }

        if(end!=null){res += end;}
        return res;
    }
}

  

/* 
StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
*/
