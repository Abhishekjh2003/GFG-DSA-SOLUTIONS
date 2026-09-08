import java.util.*;

class Solution {
    public void deleteMid(Stack<Integer> s) {
        int n = s.size();
        deleteMiddle(s, n, 0);
    }

    private void deleteMiddle(Stack<Integer> s, int n, int current) {
        if (current == n / 2) {
            s.pop();
            return;
        }

        int temp = s.pop();

        deleteMiddle(s, n, current + 1);

        s.push(temp);
    }
}