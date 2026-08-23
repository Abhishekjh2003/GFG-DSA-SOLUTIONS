import java.util.LinkedList;
import java.util.Queue;

class myStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element into stack
    void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Remove top element
    void pop() {
        if (!q1.isEmpty()) {
            q1.remove();
        }
    }

    // Return top element
    int top() {
        if (q1.isEmpty()) {
            return -1;
        }

        return q1.peek();
    }

    // Return size
    int size() {
        return q1.size();
    }
}