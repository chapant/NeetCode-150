import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q20 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();
        int l =0, r = 0;
        while (r < nums.length) {
            while (!deque.isEmpty() && nums[r] > deque.peekLast()) {
                deque.pollLast();
            }
            deque.offerLast(nums[r]);

            res[l] = deque.peekFirst();
            if(r-l+1<k){
                r++;
                continue;
            }

            if(nums[l] == deque.peekFirst()){
                deque.pollFirst();
            }
            l++;
            r++;
        }

        return res;
    }

    public static void main(String[] args) {
        Q20 q = new Q20();

        //System.out.println(Arrays.toString(q.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Arrays.toString(q.maxSlidingWindow(new int[]{-7,-8,7,5,7,1,6,0}, 4)));
    }
}