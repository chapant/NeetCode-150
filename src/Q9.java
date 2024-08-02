import java.util.HashSet;

public class Q9 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        int longest = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                set.remove(num);
                longest = 1;

                while (set.contains(num + 1)) {
                    longest ++;
                    set.remove(num + 1);
                    num++;
                }

                if (longest > max) {
                    max = longest;
                }

                longest = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Q9 q9 = new Q9();

        System.out.println(q9.longestConsecutive(new int[]{0,3,2,5,4,6,1,1}));
        //System.out.println(q9.longestConsecutive(new int[]{2,20,4,10,3,4,5}));
    }
}