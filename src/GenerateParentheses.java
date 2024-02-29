import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        var a = new GenerateParentheses();
        System.out.println(a.generateParenthesis(1));
        System.out.println(a.generateParenthesis(2));
        System.out.println(a.generateParenthesis(3));
        System.out.println(a.generateParenthesis(4));
        System.out.println(a.generateParenthesis(5));
        System.out.println(a.generateParenthesis(6));
        System.out.println(a.generateParenthesis(7));
        System.out.println(a.generateParenthesis(8));
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>(2_000);
        final int N2 = n * 2;
        final int N21 = N2 - 1;
        final int L = 1 << N2;
        final char[] sb = new char[N2];
        boolean valid;
        for (int i = L - 2, stack = 0, v, j;
            ((i & (1 << N21)) >>> N21) == 1 && i > -1;
            i -= 2, stack = 0) {

            v = i;
            j = N21;
            valid = true;
            do {
                if ((v & 1) == 0) {
                    stack++;
                    sb[j] = ')';
                } else {
                    sb[j] = '(';
                    if (stack <= 0) {
                        valid = false;
                        break;
                    } else {
                        stack--;
                    }
                }
                v >>>= 1;
                j--;
            } while (v > 0);

            if (valid && stack == 0) {
                System.out.println(Integer.toBinaryString(i));
                list.add(new String(sb));
            }
        }
        return list;
    }
}