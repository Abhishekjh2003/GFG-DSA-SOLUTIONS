import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            int span;
            if (stack.isEmpty()) {
                span = i + 1;
            } else {
                span = i - stack.peek();
            }

            ans.add(span);
            stack.push(i);
        }

        return ans;
    }
}