import java.util.HashMap;

public class Q19 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapHave = new HashMap<>();
        HashMap<Character, Integer> mapNeed = new HashMap<>();

        int have = 0, need = 0;
        int min = s.length() + 1;
        String minString = "";

        for(char c : t.toCharArray()){
            need += 1;
            if(mapNeed.containsKey(c)){
                mapNeed.put(c, mapNeed.get(c)+1);
            }else{
                mapNeed.put(c, 1);
            }
        }

        int l = 0, r = 0;
        int current = 0;
        while (r < s.length()) {
            char right = s.charAt(r);

            if(!mapNeed.containsKey(right)){
                current++;
                r++;
                continue;
            }

            int rCount = mapHave.getOrDefault(right, 0) + 1;
            mapHave.put(right, rCount);

            if(rCount <= mapNeed.get(right)){
                have++;
            }
            current++;

            if(have < need){
                r++;
                continue;
            }

            if(min > current){
                minString = s.substring(l, r + 1);
                min = current;
            }

            l++;
            while (l <= r + 1 - need){
                char left = s.charAt(l-1);
                current--;

                if(mapNeed.containsKey(left)){
                    int lCount = mapHave.get(left);
                    if(lCount == 1) mapHave.remove(left);
                    else mapHave.put(left, lCount - 1);

                    if(lCount == mapNeed.get(left)){
                        have--;
                        break;
                    }
                }

                minString = s.substring(l, r + 1);
                min = current;

                l++;
            }
            r++;
        }

        return minString;
    }

    public static void main(String[] args) {
        Q19 q19 = new Q19();

        System.out.println(q19.minWindow("ADOBECODEBANC", "ABC"));
        //System.out.println(q19.minWindow("xyz", "xyz"));
        //System.out.println(q19.minWindow("ab", "b"));
    }
}
