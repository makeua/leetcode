public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums != null ? nums.length : 0, m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println();
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[] { 1 }, 0));
        System.out.println(searchInsertPosition.searchInsert(new int[] { 1, 2 }, 0));
        System.out.println(searchInsertPosition.searchInsert(new int[] { 1, 2, 3 }, 0));
        System.out.println(searchInsertPosition.searchInsert(new int[] { 1, 2, 3, 4 }, 0));
        System.out.println(searchInsertPosition.searchInsert(new int[] { 1, 2, 3, 4, 5 }, 0));
        System.out.println(searchInsertPosition.searchInsert(new int[] { 1 }, 5));
    }
}
