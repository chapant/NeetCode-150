import java.util.Stack;
import java.util.Arrays;

public class Q25 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < temperatures.length; i++) {
            int current = temperatures[i];

            while (!stack.isEmpty() && temperatures[stack.peek()] < current) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }

            if(stack.isEmpty() || temperatures[stack.peek()] >= current) {
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }

        return res;
    }

    public static void main(String[] args) {
        Q25 q25 = new Q25();
        int[] res = q25.dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70});

        System.out.println(Arrays.toString(res));
    }
}
