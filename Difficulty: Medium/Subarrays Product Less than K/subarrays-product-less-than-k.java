// User function Template for Java

class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        if (k <= 1) return 0;

        int left = 0;
        long product = 1;
        long count = 0;

        for (int right = 0; right < n; right++) {
            product *= arr[right];

            while (product >= k && left <= right) {
                product /= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}