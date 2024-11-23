/* Link - https://leetcode.com/problems/rotating-the-box/ */

class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] ans = new char[box[0].length][box.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = '.';
            }
        }
        for (int i = 0; i < box.length; i++) {
            ArrayList<Character> al = new ArrayList<>();
            int a = 0, b = 0; 
            for (int j = box[0].length - 1; j >= 0; j--) {
                if (box[i][j] == '.') {
                    a++;
                } else if (box[i][j] == '#') {
                    b++;
                } else { 
                    while (b-- > 0) {
                        al.add(0, '#');
                    }
                    while (a-- > 0) {
                        al.add(0, '.');
                    }
                    al.add(0, '*'); 
                    a = 0;
                    b = 0;
                }
            }
            while (b-- > 0) {
                al.add(0, '#');
            }
            while (a-- > 0) {
                al.add(0, '.');
            }
            for (int y = 0; y < al.size(); y++) {
                ans[y][box.length - i - 1] = al.get(y);
            }
        }

        return ans;
    }
}
