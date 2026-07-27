class Solution {
    public int kokoEat(int[] arr, int k) {
        int low = 1;
        int high = 0;

        for (int bananas : arr) {
            high = Math.max(high, bananas);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFinish(arr, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] arr, int k, int speed) {
        long hours = 0;

        for (int bananas : arr) {
            hours += (bananas + speed - 1) / speed;
        }

        return hours <= k;
    }
}