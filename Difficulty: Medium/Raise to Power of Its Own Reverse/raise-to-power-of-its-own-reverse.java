class Solution {

    static final long MOD = 1000000007;

    int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    long power(long x, int n) {

        long result = 1;

        while (n > 0) {

            if (n % 2 == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;
            n /= 2;
        }

        return result;
    }

    int reverseExponentiation(int n) {

        int rev = reverse(n);

        return (int) power(n, rev);
    }
}