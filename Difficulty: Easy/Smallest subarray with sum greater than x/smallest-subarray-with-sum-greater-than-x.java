class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int n = arr.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > x) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
