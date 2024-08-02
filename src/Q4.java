import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q4 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] alphabet = new int[26];
            for (int i = 0; i < str.length(); i++) {
                alphabet[str.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(alphabet);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();

        String[] strs = new String[]{"act","pots","tops","cat","stop","hat"};

        System.out.println(q4.groupAnagrams(strs));
    }
}
