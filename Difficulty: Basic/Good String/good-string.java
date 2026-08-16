class Solution {
    public boolean isGoodString(String s) {

        for (int i = 0; i < s.length() - 1; i++) {

            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));

            if (diff != 1 && diff != 25) {
                return false;
            }
        }

        return true;
    }
}