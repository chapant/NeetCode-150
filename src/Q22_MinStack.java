import java.util.Stack;

public class Q22_MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Q22_MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty())
            minStack.push(val);
        else
            minStack.push(Math.min(val, minStack.peek()));
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Q22_MinStack minStack = new Q22_MinStack();

        minStack.push(-2);
        minStack.push(0);
        System.out.println(minStack.getMin());
    }
}
