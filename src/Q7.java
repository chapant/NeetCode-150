import java.util.Arrays;

public class Q7 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Q7 q7 = new Q7();
        System.out.println(Arrays.toString(q7.productExceptSelf(new int[]{1, 2, 4, 6})));
    }
}
