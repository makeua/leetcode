public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        for (int i = 1; i < 1000; i++) {
            System.out.println(i + " " + powerOfTwo.isPowerOfTwo(i));
        }
    }

    public boolean isPowerOfTwo(int n) {
        long a = n;
        a = Math.abs(a);
        return (a & (a - 1)) == 0;
    }
}
