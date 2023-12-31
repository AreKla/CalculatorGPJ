package apps.userinterface;

import apps.calculator.history.Result;
import apps.calculator.logic.Calculator;
import apps.calculator.history.ResultHistory;

import java.util.List;

import static apps.Main.scanner;

public class CalculatorApp {
    private ResultHistory resultHistory;

    public CalculatorApp(Calculator calculator, ResultHistory resultHistory) {
        this.resultHistory = resultHistory;
    }

    public void printMenu() {
        System.out.println("Wybierz działanie:");
        System.out.println("(+) Dodawanie");
        System.out.println("(-) Odejmowanie");
        System.out.println("(*) Mnożenie");
        System.out.println("(/) Dzielenie");
        System.out.println("(H) Historia wyników");
        System.out.println("(E) Exit");
    }

    private static int getInputNumber(String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public void instructionsToSum(Calculator calculator) {
        int a = getInputNumber("Enter first number:");
        int b = getInputNumber("Enter second number:");
        int result = calculator.add(a, b);
        System.out.println(result);
    }

    public void instructionsToSubtraction(Calculator calculator) {
        int a = getInputNumber("Enter first number:");
        int b = getInputNumber("Enter second number:");
        int result = calculator.subtract(a, b);
        System.out.println(result);
    }

    public void instructionsToMultiple(Calculator calculator) {
        int a = getInputNumber("Enter first number:");
        int b = getInputNumber("Enter second number:");
        int result = calculator.multiply(a, b);
        System.out.println(result);
    }

    public void instructionsToDivision(Calculator calculator) {
        int a = getInputNumber("Enter dividend:");
        int b = getInputNumber("Enter divisor:");
        try {
            int result = calculator.divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void instructionsToHistory() {
        System.out.println("Historia wyników:");
        List<Result> results = resultHistory.getResultHistory();
        if (results.isEmpty()) {
            System.out.println("Brak historii.");
        } else {
            System.out.println("Wszystkie wyniki: " + results);
            System.out.println("Ostatni wynik: " + resultHistory.getLastResult());
        }
    }
}