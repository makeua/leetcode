import java.util.Arrays;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        final int N = numbers.length;
        int l = 0, r = N - 1, s;
        while (l < r) {
            s = numbers[l] + numbers[r];
            if (s < target) {
                l++;
            } else if (s > target) {
                r--;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        throw new RuntimeException();
    }
}
