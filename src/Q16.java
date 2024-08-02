import java.util.HashSet;

public class Q16 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                max = Math.max(max, set.size());
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
        }
        max = Math.max(max, set.size());
        return max;
    }

    public static void main(String[] args) {
        Q16 q16 = new Q16();
        System.out.println(q16.lengthOfLongestSubstring("abcabcbb"));
    }
}
