package apps;

import apps.calculator.history.ResultHistory;
import apps.calculator.logic.Calculator;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ResultHistory resultHistory = new ResultHistory();
        Calculator calculator = new Calculator(resultHistory);

        System.out.println("Calculator is starting!");
        boolean flag = true;
        while (flag) {
            printMenu();
            switch (scanner.nextLine()) {
                case "+" -> instructionsToSum(calculator);
                case "-" -> instructionsToSubtraction(calculator);
                case "*" -> instructionsToMultiple(calculator);
                case "/" -> instructionsToDivision(calculator);
                case "H" -> instructionsToHistory(resultHistory);
                case "E" -> {
                    System.out.println("Calculator is stopping!");
                    flag = false;
                }
                default -> flag = false;
            }
        }
    }

    private static void instructionsToSum(Calculator calculator) {
        System.out.println("Enter first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int b = Integer.parseInt(scanner.nextLine());
        int result = calculator.add(a, b);
        System.out.println(result);
    }

    private static void instructionsToSubtraction(Calculator calculator) {
        System.out.println("Enter first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int b = Integer.parseInt(scanner.nextLine());
        int result = calculator.subtract(a, b);
        System.out.println(result);
    }

    private static void instructionsToMultiple(Calculator calculator) {
        System.out.println("Enter first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int b = Integer.parseInt(scanner.nextLine());
        int result = calculator.multiply(a, b);
        System.out.println(result);
    }

    private static void instructionsToDivision(Calculator calculator) {
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

    private static void instructionsToHistory(ResultHistory resultHistory) {
        System.out.println("Historia wyników:");
        List<Integer> history = resultHistory.getResultHistory();
        if (history.isEmpty()) {
            System.out.println("Brak historii.");
        } else {
            System.out.println("Wszystkie wyniki: " + history);
            System.out.println("Ostatni wynik: " + resultHistory.getLastResult());
        }
    }

    private static void printMenu() {
        System.out.println("Wybierz działanie:");
        System.out.println("(+) Dodawanie");
        System.out.println("(-) Odejmowanie");
        System.out.println("(*) Mnożenie");
        System.out.println("(/) Dzielenie");
        System.out.println("(H) Historia wyników");
        System.out.println("(E) Exit");
    }
}