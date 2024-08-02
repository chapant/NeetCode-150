import java.util.Arrays;
import java.util.Stack;

public class Q26_CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        double[][] pairs = new double[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            double ttr = (target - pairs[i][0]) / pairs[i][1];
            if(stack.isEmpty()) stack.push(ttr);

            if(stack.peek() < ttr) { stack.push(ttr); }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        Q26_CarFleet q = new Q26_CarFleet();

        System.out.println(q.carFleet(10, new int[] { 2, 1, 3 }, new int[] { 2, 1, 3 }));
    }
}
