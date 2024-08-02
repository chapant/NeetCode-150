import java.util.HashMap;

public class Q17 {
    public int characterReplacement(String s, int k) {
        int longest = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int max = 0;
        while (r < s.length()) {
            char right = s.charAt(r);

            if (map.containsKey(right)) {
                int count = map.get(right) + 1;
                map.put(right, count);
                max = Math.max(max, count);
            }else{
                map.put(right, 1);
                max = Math.max(max, 1);
            }

            if(r - l + 1 - max <= k) {
                longest = Math.max(longest, r - l + 1);
            } else {
                char left = s.charAt(l);
                int count = map.get(left) - 1;
                if(count == 0) {
                    map.remove(left);
                }else{
                    map.put(left, count);
                }

                l++;
            }

            r++;
        }

        return longest;
    }

    public static void main(String[] args) {
        Q17 q = new Q17();

        System.out.println(q.characterReplacement("abcddedcaabca", 2));
    }
}
