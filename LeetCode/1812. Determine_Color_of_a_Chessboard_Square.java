/* Link - https://leetcode.com/problems/determine-color-of-a-chessboard-square */

class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '0';

        if(x % 2 == 0){
            if(y % 2 == 0){
                return true;
            }
            return false;
        }
        if(y % 2 == 0){
            return false;
        }
        return true; 
    }
}


/* 
if(coordinates.charAt(0)=='a' || coordinates.charAt(0)=='c' || 
            coordinates.charAt(0)=='e'|| coordinates.charAt(0)=='g'){
            if(coordinates.charAt(1)%2==1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if(coordinates.charAt(1)%2==1){
                return true;
            }
            else{
                return false;
            }
        }
*/
