import java.util.HashMap;

public class Q2_1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }

            if (map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                map.put(t.charAt(i), -1);
            }
        }

        for(Character c : map.keySet()){
            if (map.get(c) != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Q2_1 q = new Q2_1();
        //System.out.println(q.isAnagram("racecar", "carrace"));
        System.out.println(q.isAnagram("listen", "silent"));
    }
}
