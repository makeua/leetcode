public class ApplyOperationsToAnArray {

    public int[] applyOperations(int[] nums) {
        int i, j = 0, N = nums != null ? nums.length : 0, n;
        for (i = 0; i < N - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        i = 0;
        for (; i < N; i++) {
            n = nums[i];
            if (n != 0) {
                nums[j++] = n;
            }
        }
        for (; j < N; j++) {
            nums[j] = 0;
        }
        return nums;
    }
}
