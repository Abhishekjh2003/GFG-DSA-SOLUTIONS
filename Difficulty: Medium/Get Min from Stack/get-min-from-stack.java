import java.util.Stack;

class SpecialStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Push element
    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty()) {
            minStack.push(x);
        } else {
            minStack.push(Math.min(x, minStack.peek()));
        }
    }

    // Pop element
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        stack.pop();
        minStack.pop();
    }

    // Return top element
    public int peek() {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    // Return minimum element
    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.peek();
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}