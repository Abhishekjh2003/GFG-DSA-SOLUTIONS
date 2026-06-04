// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int k = pat.length();
        int n = txt.length();

        int[] pCount = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < k; i++) {
            pCount[pat.charAt(i) - 'a']++;
            window[txt.charAt(i) - 'a']++;
        }

        int count = 0;

        if (isSame(pCount, window)) {
            count++;
        }

        for (int i = k; i < n; i++) {
            window[txt.charAt(i) - 'a']++;
            window[txt.charAt(i - k) - 'a']--;

            if (isSame(pCount, window)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
        
    }
}