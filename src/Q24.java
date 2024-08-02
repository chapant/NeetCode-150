import java.util.*;

public class Q24 {
    public static char OPEN_PARENTHESIS = '(', CLOSED_PARENTHESIS = ')';
    List<String> res = new ArrayList<>();
    int N = 0;
    Stack<Character> stack = new Stack<>();

    public List<String> generateParenthesis(int n) {
        N = n;
        process(0, 0);
        return res;
    }

    private void process(int open, int closed){
        if(N == open && open == closed){
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }

            String result = sb.toString();
            res.add(result);
            return;
        }

        if(open < N){
            stack.push(OPEN_PARENTHESIS);
            process(open + 1, closed);
            stack.pop();
        }

        if(closed < open){
            stack.push(CLOSED_PARENTHESIS);
            process(open, closed + 1);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Q24 q = new Q24();
        List<String> res = q.generateParenthesis(4);

        System.out.println(String.join(",", res));
    }
}
