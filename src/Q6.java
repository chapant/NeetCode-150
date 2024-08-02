import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for (String str : strs){
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        boolean isText = false;
        int count = 0;
        for(char c : str.toCharArray()){
            if(!isText){
                if(c == '#'){
                    count = Integer.valueOf(sb.toString());
                    sb.setLength(0);
                    isText = true;

                    if (count == 0){
                        list.add("");
                        isText = false;
                    }
                    continue;
                }

                sb.append(c);
            } else {
                sb.append(c);
                count --;

                if (count <= 0){
                    list.add(sb.toString());
                    sb.setLength(0);
                    isText = false;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Q6 q6 = new Q6();

        System.out.println(q6.decode(q6.encode(List.of(new String[]{"neet", "code", "love", "you"}))));
    }
}
