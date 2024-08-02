import java.util.Arrays;

public class Q11 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left+1, right+1};
            }

            if (sum < target) {
                left++;
                continue;
            }

            right--;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Q11 q11 = new Q11();
        System.out.println(Arrays.toString(q11.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
