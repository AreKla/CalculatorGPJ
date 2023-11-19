package apps;

import apps.calculator.logic.Calculator;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Calculator is starting!");
        boolean flag = true;
        while (flag) {
            printMenu();
            switch (scanner.nextLine()) {
                case "+" -> instructionsToSum(calculator);
                case "-" -> instructionsToSubtraction(calculator);
                case "*" -> instructionsToMultiple(calculator);
                case "/" -> instructionsToDivision(calculator);
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

    private static void printMenu() {
        System.out.println("Wybierz działanie:");
        System.out.println("(+) Dodawanie");
        System.out.println("(-) Odejmowanie");
        System.out.println("(*) Mnożenie");
        System.out.println("(/) Dzielenie");
        System.out.println("(E) Exit");
    }

    //TODO dodaj pętle i proste menu do obliczania. Możesz wykorzystać switch() jako menu, żeby użytkownik mógł coś wybierać, dodawanie, odejmowanie,
    // mnożenie i dzielenie(nie można dzielić przez 0),
    //Todo może dodasz ArrayList jako pamięć kalkulatora i będzie zapisywało wyniki jako kolejne rekordy, potem w menu głównym będzie można sprawdzić
    // wszystkie wyniki albo np ostatni

}