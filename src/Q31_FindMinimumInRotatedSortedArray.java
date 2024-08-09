import java.text.MessageFormat;

public class Q31_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int min = nums[0];
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            if(nums[l] < nums[r]){
                min = Math.min(min, nums[l]);
                break;
            }

            int mid = (r + l) / 2;
            min = Math.min(min, nums[mid]);
            if (nums[mid] < nums[l]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

            System.out.println(MessageFormat.format("l={0},mid={1},r={2},min={3}", nums[l], nums[mid], nums[r], min));
        }

        return min;
    }

    public static void main(String[] args) {
        Q31_FindMinimumInRotatedSortedArray q = new Q31_FindMinimumInRotatedSortedArray();
        System.out.println(q.findMin(new int[]{10,11,0,1,2,3,4,5,6,7,8,9}));
    }
}
