import java.util.Stack;

class myQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Function to push an element into the queue.
    void enqueue(int x) {
        s1.push(x);
    }

    // Function to pop an element from the queue.
    int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) {
            return -1;
        }

        return s2.pop();
    }

    // Function to return the front element.
    int front() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) {
            return -1;
        }

        return s2.peek();
    }

    // Function to return the size of the queue.
    int size() {
        return s1.size() + s2.size();
    }
}
