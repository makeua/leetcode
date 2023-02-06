public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, N = nums.length, n;
        for (; i < N; i++) {
            n = nums[i];
            if (n != 0) {
                nums[j++] = n;
            }
        }
        for (; j < N; j++) {
            nums[j] = 0;
        }
    }
}
