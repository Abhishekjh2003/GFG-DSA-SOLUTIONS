import java.util.*;

class Solution {
    public int maxArea(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        int[] heights = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            // Build histogram for current row
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            // Find maximum rectangle in histogram
            maxArea = Math.max(maxArea, largestRectangle(heights));
        }

        return maxArea;
    }

    private int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   heights[stack.peek()] > heights[i]) {

                int h = heights[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                max = Math.max(max, h * width);
            }

            stack.push(i);
        }

        // Remaining elements
        while (!stack.isEmpty()) {
            int h = heights[stack.pop()];

            int width;
            if (stack.isEmpty()) {
                width = n;
            } else {
                width = n - stack.peek() - 1;
            }

            max = Math.max(max, h * width);
        }

        return max;
    }
}