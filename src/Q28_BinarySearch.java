public class Q28_BinarySearch {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) return mid;

            if (nums[mid] < target) i = mid + 1;
            else j = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Q28_BinarySearch obj = new Q28_BinarySearch();
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println(obj.search(nums, 11));
    }
}
