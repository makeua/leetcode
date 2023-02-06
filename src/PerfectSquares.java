public class PerfectSquares {

    private static final int N = 100;
    private static final int[] squares = new int[N * N];

    static {
        for (int i = 0, j = 1; i < N; i++, j++) {
            squares[i] = j * j;
        }
    }

    public int numSquares(int n) {
        int l = 0, r = N, m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (squares[m] < n) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int[] table = new int[n + 1];
        table[0] = 0;
        for (int i = 1; i <= n; i++) {
            table[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= l; j++)
                if (squares[j] <= i) {
                    int sub_res = table[i - squares[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
        }
        return table[n];
    }

    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        for (int i = 1; i < 20; i++) {
            System.out.println(i + " " + perfectSquares.numSquares(i));
        }
    }
}
