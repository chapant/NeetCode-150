import java.util.Arrays;
import java.util.HashMap;

public class Q3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        //System.out.println(Arrays.toString(q3.twoSum(new int[]{2, 7, 11, 15}, 13)));
        //System.out.println(Arrays.toString(q3.twoSum(new int[]{3,4,5,6}, 7)));
        System.out.println(Arrays.toString(q3.twoSum(new int[]{4,5,6}, 10)));
    }
}
