import java.util.HashSet;

public class Q1 {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        Q1 q = new Q1();
        int[] nums = new int[]{1, 2, 3, 4};
        //int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(q.hasDuplicate(nums));
    }
}