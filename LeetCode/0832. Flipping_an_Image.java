/* Link - https://leetcode.com/problems/flipping-an-image/ */

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image[0].length;
        int[] tempRow = new int[len];

        for(int row = 0;row < image.length;row++){
            int counter = len-1;
            for(int column:image[row]){
                tempRow[counter] = (1 - column);
                counter--;
            }
            image[row] = tempRow.clone();
        }
        System.gc();
        return image;
    }
}


/* 
int row = image.length;
        int col = image[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = image[i][col-j-1];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = res[i][j] == 1 ? 0 : 1; 
            }
        }
        return res;
*/
