class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {

        if ((long) k * m > arr.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : arr) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canMake(arr, k, m, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canMake(int[] arr, int k, int m, int day) {
        int flowers = 0;
        int bouquets = 0;

        for (int bloom : arr) {
            if (bloom <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}