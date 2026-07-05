class Solution {

    public int maxCircularSum(int arr[]) {

        int totalSum = arr[0];

        int currMax = arr[0];
        int maxSum = arr[0];

        int currMin = arr[0];
        int minSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            totalSum += arr[i];

            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }

        if (maxSum < 0)
            return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}