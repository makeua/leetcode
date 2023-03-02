public class ReverseBits {

    private static final int all_ones = -1;

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(all_ones));
    }

    public int reverseBits(int n) {
        int a = 0;
        for (int i = 0; i < 32; i++) {
            a |= (((1 << i) & n) >> i) << (32 - i);
        }
        return a;
    }
}
