/* Link - https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/ */ 

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list=new ArrayList();
        char a=s.charAt(0);
        char a1=s.charAt(1);
        char b=s.charAt(3);
        char b1=s.charAt(4);
        StringBuilder sb=new StringBuilder();
        for(char j=a;j<=b;j++){
            for(char i=a1;i<=b1;i++){
                sb.append(j);
                sb.append(i);
                list.add(sb.toString());
                sb=new StringBuilder();
            }
        }

        return list;
    }
}


/* 
        List<String> ans = new ArrayList<>();
        char startcol = s.charAt(0), startrow = s.charAt(1),
        endcol = s.charAt(3), endrow = s.charAt(4);
        while(startcol<=endcol){
            while(startrow<=endrow){
                ans.add(startcol+""+startrow);
                startrow++;
            }
            startrow = s.charAt(1);
            startcol++;
        }
        return ans;
*/
