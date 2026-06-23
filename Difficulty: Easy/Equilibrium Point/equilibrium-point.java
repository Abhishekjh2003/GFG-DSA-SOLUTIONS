class Solution {
    public int findEquilibrium(int[] arr) {
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        long leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // right sum

            if (leftSum == totalSum) {
                return i; // return index
            }

            leftSum += arr[i];
        }

        return -1;
    }
}