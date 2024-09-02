/* Link - https://www.geeksforgeeks.org/problems/minimum-cost-path3833/1 */

class Solution {
    // Directions array for movement in 4 possible directions
    private static final int[] dRow = {-1, 1, 0, 0};
    private static final int[] dCol = {0, 0, -1, 1};

    public int minimumCostPath(int[][] grid) {
        int n = grid.length;
        int[][] dist = new int[n][n];
        
        // Initialize all distances as infinite except the start point
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = grid[0][0];
        
        // Priority Queue to pick the cell with the least cost first
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{grid[0][0], 0, 0}); // (cost, row, col)

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currCost = current[0];
            int i = current[1];
            int j = current[2];

            // If we have reached the bottom-right corner, return the cost
            if (i == n - 1 && j == n - 1) {
                return currCost;
            }

            // Explore all 4 possible directions
            for (int d = 0; d < 4; d++) {
                int newRow = i + dRow[d];
                int newCol = j + dCol[d];

                // Check if the new cell is within bounds
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                    int newCost = currCost + grid[newRow][newCol];
                    // If this path to new cell is cheaper, update and push to PQ
                    if (newCost < dist[newRow][newCol]) {
                        dist[newRow][newCol] = newCost;
                        pq.add(new int[]{newCost, newRow, newCol});
                    }
                }
            }
        }

        // Return the minimum cost to reach the bottom-right corner
        return dist[n - 1][n - 1];
    }
}
