class Solution {
    long floorSqrt(long n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long low = 1, high = n;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid <= n / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}