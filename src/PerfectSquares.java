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

        if (squares[l] > n) {
            l--;
        }

        int ans = 0;

        while (n > 0) {
            for (int i = l; i > 0; i--) {
                if (n % squares[i] == 0) {
                    ans += n / squares[i];
                    n = 0;
                    break;
                }
            }
            if (n > 0) {
                for (int i = l; i >= 0; i--) {
                    if (squares[i] <= n) {
                        n -= squares[i];
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        for (int i = 19; i < 20; i++) {
            System.out.println(i + " " + perfectSquares.numSquares(i));
        }
    }
}
