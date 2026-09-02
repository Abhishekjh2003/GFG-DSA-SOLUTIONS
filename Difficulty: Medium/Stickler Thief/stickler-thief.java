class Solution {
    public int findMaxSum(int arr[]) {
        int prev2 = 0;
        int prev1 = 0;

        for (int money : arr) {
            int curr = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}