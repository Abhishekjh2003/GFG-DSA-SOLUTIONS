import java.util.Stack;

class myStack {

    Stack<Integer> stack = new Stack<>();

    // Insert element
    void push(int x) {
        stack.push(x);
    }

    // Remove top element
    void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    // Return top element
    int peek() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    // Check if stack is empty
    boolean isEmpty() {
        return stack.isEmpty();
    }

    // Return size of stack
    int getSize() {
        return stack.size();
    }
}