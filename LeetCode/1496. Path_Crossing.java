/* Link - https://leetcode.com/problems/path-crossing/ */

class Solution {
    int x =0;
    int y=0;
    Solution(int x,int y){
        this.x =x;
        this.y = y;
    }
     Solution(){
    }
    public boolean equals(Object obj){
        Solution s = (Solution) obj;
        return (x == s.x && y == s.y);
    }
    public int hashCode(){
        return x * 100000 + y;
    }
    public String toString(){
        return "("+x +" ,  "+y+")";
    }
    public boolean isPathCrossing(String path) {
        int tbC = 0;
        int lrC = 0;
        Map<Solution, Boolean> map = new HashMap<>();
         Solution s = new Solution(0,0);
        map.put(s,true);
        for(char c: path.toCharArray()){
            if(c == 'N'){
                tbC++;
            }else if(c == 'S'){
                tbC--;
            }else if(c == 'E'){
                lrC++;
            }else{
                lrC--;
            }
            s = new Solution(lrC,tbC);
            if(map.get(s) != null){
              return true;
            }
            map.put(s,true);
        }
       
        return false;
    }
}

/* 
Set<String> visitedPoints = new HashSet<>();
        int currentX=0, currentY=0;
        visitedPoints.add(currentX+","+currentY);
        for(char direction: path.toCharArray()){
            if(direction == 'N') currentY++;
            else if (direction == 'S') currentY--;
            else if (direction == 'E') currentX++;
            else currentX--;

            String point = currentX + "," + currentY;
            if (visitedPoints.contains(point)) {
                return true;
            }

            visitedPoints.add(point);
        }
        return false;
*/
