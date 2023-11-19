package apps.userinterface;

import apps.calculator.logic.Calculator;
import apps.calculator.history.ResultHistory;

import java.util.List;

import static apps.Main.scanner;

public class CalculatorApp {
    private Calculator calculator;
    private ResultHistory resultHistory;

    public CalculatorApp(Calculator calculator, ResultHistory resultHistory) {
        this.calculator = calculator;
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

    public void instructionsToSum() {
        System.out.println("Enter first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int b = Integer.parseInt(scanner.nextLine());
        int result = calculator.add(a, b);
        System.out.println(result);
    }

    public void instructionsToSubtraction() {
        System.out.println("Enter first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int b = Integer.parseInt(scanner.nextLine());
        int result = calculator.subtract(a, b);
        System.out.println(result);
    }

    public void instructionsToMultiple() {
        System.out.println("Enter first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int b = Integer.parseInt(scanner.nextLine());
        int result = calculator.multiply(a, b);
        System.out.println(result);
    }

    public void instructionsToDivision() {
        System.out.println("Enter dividend:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter divisor:");
        int b = Integer.parseInt(scanner.nextLine());
        try {
            int result = calculator.divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void instructionsToHistory() {
        System.out.println("Historia wyników:");
        List<Integer> history = resultHistory.getResultHistory();
        if (history.isEmpty()) {
            System.out.println("Brak historii.");
        } else {
            System.out.println("Wszystkie wyniki: " + history);
            System.out.println("Ostatni wynik: " + resultHistory.getLastResult());
        }
    }
}
