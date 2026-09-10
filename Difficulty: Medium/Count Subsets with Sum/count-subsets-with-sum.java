class Solution {
    public int perfectSum(int[] arr, int sum) {
        int n = arr.length;

        int[][] dp = new int[n + 1][sum + 1];

        // Empty subset has sum 0
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                // Don't take current element
                dp[i][j] = dp[i - 1][j];

                // Take current element if possible
                if (arr[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }
}