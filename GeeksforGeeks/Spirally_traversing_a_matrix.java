/* Link - https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1 */

class Solution {
    public void right(ArrayList<Integer> al, int i, int j, int m[][], boolean[][] b) {
        while (j < m[0].length && b[i][j]) {
            b[i][j] = false;
            al.add(m[i][j]);
            j++;
        }
        if (i + 1 < m.length && b[i + 1][j - 1]) down(al, i + 1, j - 1, m, b);
    }

    public void down(ArrayList<Integer> al, int i, int j, int m[][], boolean[][] b) {
        while (i < m.length && b[i][j]) {
            b[i][j] = false;
            al.add(m[i][j]);
            i++;
        }
        if (j - 1 >= 0 && b[i - 1][j - 1]) left(al, i - 1, j - 1, m, b);
    }

    public void left(ArrayList<Integer> al, int i, int j, int m[][], boolean[][] b) {
        while (j >= 0 && b[i][j]) {
            b[i][j] = false;
            al.add(m[i][j]);
            j--;
        }
        if (i - 1 >= 0 && b[i - 1][j + 1]) up(al, i - 1, j + 1, m, b);
    }

    public void up(ArrayList<Integer> al, int i, int j, int m[][], boolean[][] b) {
        while (i >= 0 && b[i][j]) {
            b[i][j] = false;
            al.add(m[i][j]);
            i--;
        }
        if (j + 1 < m[0].length && b[i + 1][j + 1]) right(al, i + 1, j + 1, m, b);
    }

    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int m[][]) {
        boolean[][] b = new boolean[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) b[i][j] = true;
        }
        int i = 0, j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        right(al, i, j, m, b);
        return al;
    }
}
