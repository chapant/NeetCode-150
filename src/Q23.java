import java.util.Stack;

public class Q23 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int a, b = 0;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a - b);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Q23 q = new Q23();

        System.out.println(q.evalRPN(new String[]{"1","2","+","3","*","4","-"}));
    }
}
