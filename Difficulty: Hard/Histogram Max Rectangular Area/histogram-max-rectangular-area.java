import java.util.*;

class Solution {
    public int getMaxArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : arr[i];

            while (!stack.isEmpty() && arr[stack.peek()] > currHeight) {
                int height = arr[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}