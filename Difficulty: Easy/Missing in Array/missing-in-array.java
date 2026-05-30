   class Solution {
    int missingNum(int arr[]) {

        long sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int N = n + 1;
        long totalSum = (long)N * (N + 1) / 2;

        return (int)(totalSum - sum);
    }
}