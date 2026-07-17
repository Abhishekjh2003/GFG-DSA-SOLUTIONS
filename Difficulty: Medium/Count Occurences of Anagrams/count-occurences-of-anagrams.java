class Solution {
    int search(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();

        int[] patFreq = new int[26];
        int[] winFreq = new int[26];

        for (char ch : pat.toCharArray()) {
            patFreq[ch - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            winFreq[txt.charAt(i) - 'a']++;

            if (i >= k) {
                winFreq[txt.charAt(i - k) - 'a']--;
            }

            if (i >= k - 1) {
                boolean same = true;

                for (int j = 0; j < 26; j++) {
                    if (patFreq[j] != winFreq[j]) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    count++;
                }
            }
        }

        return count;
    }
}