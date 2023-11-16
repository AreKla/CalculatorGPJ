package apps.calculator.logic;

public class Calculator {

    public int add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("None of the numbers can be null");
        }
        return a + b;
    }

    public int subtract(Integer a, Integer b) {
        return a - b;
    }

    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}