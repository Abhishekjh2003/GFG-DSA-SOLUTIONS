import java.util.Stack;

class Solution {

    public void deleteMid(Stack<Integer> st) {
        int n = st.size();
        delete(st, n, 0);
    }

    private void delete(Stack<Integer> st, int n, int count) {

        // Middle element reached
        if (count == n / 2) {
            st.pop();
            return;
        }

        // Remove top temporarily
        int x = st.pop();

        // Recursively reach middle
        delete(st, n, count + 1);

        // Put element back
        st.push(x);
    }
}