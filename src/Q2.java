import java.util.HashMap;

public class Q2 {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] alphabet = new int[26];

        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for(int c : alphabet){
            if(c != 0) return false;
        }

        /*HashMap<String, Integer> sMap = new HashMap<>();
        HashMap<String, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            String ss = s.substring(i, i + 1);
            String tt = t.substring(i, i + 1);

            if(!sMap.containsKey(ss)) sMap.put(ss, 1);
            else sMap.put(ss, sMap.get(ss) + 1);

            if(!tMap.containsKey(tt)) tMap.put(tt, 1);
            else tMap.put(tt, tMap.get(tt) + 1);
        }

        if(sMap.size() != tMap.size()) return false;

        for(String key : sMap.keySet()) {
            if(!tMap.containsKey(key)) return false;
            if(!tMap.get(key).equals(sMap.get(key))) return false;
        }*/

        return true;
    }

    public static void main(String[] args) {
        Q2 q = new Q2();
        System.out.println(q.isAnagram("racecar", "carrace"));
        //System.out.println(q.isAnagram("jar", "jam"));
    }
}
