class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int D) {
        int low = 0;
        int high = 0;

        for (int weight : arr) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canShip(arr, D, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canShip(ArrayList<Integer> arr, int D, int capacity) {
        int days = 1;
        int load = 0;

        for (int weight : arr) {
            if (load + weight > capacity) {
                days++;
                load = weight;
            } else {
                load += weight;
            }
        }

        return days <= D;
    }
}