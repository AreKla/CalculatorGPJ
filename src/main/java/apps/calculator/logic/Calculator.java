package apps.calculator.logic;

import apps.calculator.history.ResultHistory;

public class Calculator {

    private ResultHistory resultHistory;

    public Calculator(ResultHistory resultHistory) {
        this.resultHistory = resultHistory;
    }

    public int add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided and cannot be null");
        }
        int i = a + b;
        resultHistory.addToHistory(i, String.format("Sum of %d + %d", a, b));
        return i;
    }

    //TODO możesz dodać metodę zapisu do pamięci kalkulatora w pozostałych metodach

    public int subtract(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided and cannot be null");
        }
        return a - b;
    }

    public int multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided and cannot be null");
        }
        return a * b;
    }

    public int divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided and cannot be null");
        }
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
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