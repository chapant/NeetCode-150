import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] < target) {
                    left++;
                } else if (nums[left] + nums[right] > target){
                    right--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Q12 q12 = new Q12();
        System.out.println(q12.threeSum(new int[]{-1, 3, 0, 1, 2, 2, -1, -4}));
    }
}