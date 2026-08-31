import java.util.*;

class Solution {

    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(fib(i));
        }

        return result;
    }

    private int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}