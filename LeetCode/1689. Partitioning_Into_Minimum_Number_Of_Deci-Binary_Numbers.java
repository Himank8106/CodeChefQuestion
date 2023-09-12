/* Link - https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/ */ 

class Solution {
    public int minPartitions(String n) {
        if(n.contains("9")) {return 9;}
        else if(n.contains("8")){return 8;}
        else if(n.contains("7")){return 7;}
        else if(n.contains("6")){return 6;}
        else if(n.contains("5")){return 5;}
        else if(n.contains("4")){return 4;}
        else if(n.contains("3")){return 3;}
        else if(n.contains("2")){return 2;}else{
        return 1;
        }
    }
}

/* 
int max = n.charAt(0);
        char[] nA = n.toCharArray();
        for(int i = 1; i < n.length(); i++){            
            if(max < nA[i]) max = nA[i];
        }
        System.gc();
        return max-48;
*/ 

/*
int count = 0;
        for(int i=0; i<n.length(); i++){
            int x = n.charAt(i) - '0';
            count = Math.max(count, x);
        }
        return count;
*/
