import java.util.HashMap;
import java.util.Stack;

public class Q21 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char c : s.toCharArray()) {
            if(!map.containsKey(c)) {
                stack.push(c);
                continue;
            }

            if(!stack.isEmpty() && map.get(c) == stack.peek()) {
                stack.pop();
                continue;
            }

            return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Q21 q21 = new Q21();

        System.out.println(q21.isValid("([{}])"));
    }
}
