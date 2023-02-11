public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image != null ? image.length : 0;
        int m = n > 0 ? (image[0] != null ? image[0].length : 0) : 0;
        if (n > 0 && m > 0) {
            int scolor = image[sr][sc];
            if (scolor != color) {
                fill(image, sr, sc, n, m, scolor, color);
            }
        }
        return image;
    }

    void fill(int[][] g, int i, int j, int n, int m, int scolor, int c) {
        if (0 <= i && i < n && 0 <= j && j < m && g[i][j] == scolor) {
            g[i][j] = c;
            fill(g, i - 1, j, n, m, scolor, c);
            fill(g, i + 1, j, n, m, scolor, c);
            fill(g, i, j - 1, n, m, scolor, c);
            fill(g, i, j + 1, n, m, scolor, c);
        }
    }
}
