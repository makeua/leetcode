import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int l = 0, r = nums != null ? nums.length : 0, m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (nums[m] > target) {
                r = m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        List<int[]> arrays = new ArrayList<>();
        arrays.add(null);
        arrays.add(new int[] {});
        arrays.add(new int[] { 1 });
        arrays.add(new int[] { 1, 2 });
        arrays.add(new int[] { 1, 2, 3, 4, 5 });
        arrays.add(new int[] { 5, 6, 7, 8, 9 });
        arrays.add(new int[] { 3, 4, 5, 6, 7 });

        for (int[] array : arrays) {
            System.out.println(binarySearch.search(array, 5));
        }
    }
}
