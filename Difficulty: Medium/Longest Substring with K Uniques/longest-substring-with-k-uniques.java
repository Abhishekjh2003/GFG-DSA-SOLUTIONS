class Solution {
    public int longestKSubstr(String s, int k) {
        int[] freq = new int[26];
        
        int left = 0;
        int unique = 0;
        int maxLen = -1;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (freq[ch - 'a'] == 0) {
                unique++;
            }
            freq[ch - 'a']++;

            while (unique > k) {
                char leftChar = s.charAt(left);

                freq[leftChar - 'a']--;
                if (freq[leftChar - 'a'] == 0) {
                    unique--;
                }

                left++;
            }

            if (unique == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}