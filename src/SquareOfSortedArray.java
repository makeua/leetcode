import java.util.Arrays;

public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] a = new int[nums != null ? nums.length : 0];
        for (int i = 0; i < a.length; i++) {
            a[i] = nums[i] * nums[i];
        }
        Arrays.sort(a);
        return a;
    }
}
