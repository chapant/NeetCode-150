import java.util.*;

public class Q5 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length + 1];
        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        for(int i = list.length - 1; i > 0; i--) {
            for(Integer num : list[i]) {
                res[k-1] = num;
                k--;

                if(k < 1) return res;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Q5 q = new Q5();

        System.out.println(Arrays.toString(q.topKFrequent(new int[]{0, 0, 1, 2, 2, 3, 3, 3}, 3)));
    }
}