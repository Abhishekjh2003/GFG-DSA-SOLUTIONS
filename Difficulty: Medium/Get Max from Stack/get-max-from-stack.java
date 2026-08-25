import java.util.Stack;

class SpecialStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    // Push element
    public void push(int x) {
        stack.push(x);

        if (maxStack.isEmpty()) {
            maxStack.push(x);
        } else {
            maxStack.push(Math.max(x, maxStack.peek()));
        }
    }

    // Pop element
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        stack.pop();
        maxStack.pop();
    }

    // Return top element
    public int peek() {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    // Return maximum element
    public int getMax() {
        if (maxStack.isEmpty()) {
            return -1;
        }

        return maxStack.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}