import java.util.concurrent.atomic.AtomicInteger;

public class MaxAreaOfIsland {

    public static void main(String[] args) {
        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        maxAreaOfIsland.maxAreaOfIsland(new int[][] { {} });
    }

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid != null ? grid.length : 0;
        int m = n > 0 ? (grid[0] != null ? grid[0].length : 0) : 0;

        int[][] u = new int[n][m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (u[i][j] == 0 && grid[i][j] == 1) {
                    AtomicInteger area = new AtomicInteger();
                    maxArea(grid, u, i, j, n, m, area);
                    max = Math.max(area.get(), max);
                }
            }
        }

        return max;
    }

    public void maxArea(int[][] g, int[][] u, int i, int j, int n, int m, AtomicInteger area) {
        if (0 <= i && i < n && 0 <= j && j < m && u[i][j] == 0) {
            u[i][j] = 1;
            if (g[i][j] == 1) {
                area.incrementAndGet();
                maxArea(g, u, i - 1, j, n, m, area);
                maxArea(g, u, i + 1, j, n, m, area);
                maxArea(g, u, i, j - 1, n, m, area);
                maxArea(g, u, i, j + 1, n, m, area);
            }
        }
    }
}
