public class PerfectSquares {
    public int numSquares(int n) {
        final int N = 100;
        final int[] squares = new int[N * N];
        for (int i = 1; i < N + 1; i++) {
            squares[i - 1] = i * i;
        }
        int ans = 0;
        while (n > 0) {
            int l = 0, r = N, m;
            while (l < r) {
                m = l + (r - l) / 2;
                if (squares[m] < n) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }

            System.out.println(l + " " + squares[l - 1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        System.out.println(perfectSquares.numSquares(1));
    }
}
