public class RotateArray {
    public void rotate(int[] nums, int k) {
        final int N = nums != null ? nums.length : 0;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[(i + k) % N] = nums[i];
        }
        System.arraycopy(a, 0, nums, 0, N);
    }
}
