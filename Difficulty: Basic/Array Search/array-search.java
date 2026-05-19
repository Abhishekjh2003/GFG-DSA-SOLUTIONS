class Solution {
    public int search(int arr[], int y) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == y) {
                return i;
            }
        }

        return -1;
    }
}