package apps.calculator.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @Test
    void shouldReturnSumOfTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(4, 6);

        assertEquals(10, result, "Incorrect sum");
    }

    @Test
    void shouldAddLargeAndSmallNumbers() {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(Integer.MAX_VALUE - 15, 5);
        int result2 = calculator.add(Integer.MIN_VALUE, 1);

        assertEquals(Integer.MAX_VALUE - 10, result1, "Incorrect sum for large numbers");
        assertEquals(Integer.MIN_VALUE + 1, result2, "Incorrect sum for small numbers");
    }

    @Test
    void shouldAddZero() {
        Calculator calculator = new Calculator();

        int result = calculator.add(0, 100);

        assertEquals(100, result, "Incorrect sum with zero");
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        Calculator calculator = new Calculator();

        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> calculator.add(null, 10));
        assertEquals("First input cannot be null", exception1.getMessage(), "Invalid exception message");

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> calculator.add(10, null));
        assertEquals("Second input cannot be null", exception2.getMessage(), "Invalid exception message");

        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> calculator.add(null, null));
        assertEquals("Both inputs cannot be null", exception3.getMessage(), "Invalid exception message");
    }

    @Test
    void shouldReturnMaxValue() {
        Calculator calculator = new Calculator();

        int[] array = {-100, -45, 0, 37};

        int max = calculator.findMax(array);

        assertEquals(37, max, "Incorrect max value");
    }

    @Test
    void shouldReturnFibonacciForNumber() {
        Calculator calculator = new Calculator();

        int fibonacci = calculator.fibonacci(8);

        assertEquals(21, fibonacci, "Incorrect Fibonacci value for 8");
    }

    @Test
    void shouldIdentifyPrimeAndNonPrimeNumbers() {
        Calculator calculator = new Calculator();

        boolean isPrimeFor2 = calculator.isPrime(2);
        boolean isNotPrimeFor4 = calculator.isPrime(4);

        assertTrue(isPrimeFor2, "2 should be prime");
        assertFalse(isNotPrimeFor4, "4 should not be prime");
    }
}