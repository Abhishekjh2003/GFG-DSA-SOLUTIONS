class Solution {
    public ArrayList<String> permutation(String s) {
        ArrayList<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();
        solve(arr, 0, ans);
        Collections.sort(ans);
        return ans;
    }

    private void solve(char[] arr, int idx, ArrayList<String> ans) {
        if (idx == arr.length) {
            ans.add(new String(arr));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            solve(arr, idx + 1, ans);
            swap(arr, idx, i);
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}