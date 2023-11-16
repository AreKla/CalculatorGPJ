package apps;

import apps.calculator.logic.Calculator;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Calculator is starting!");
        printMenu();
        boolean flag = true;
        while (flag) {
            printMenu();
            switch (scanner.nextLine()) {
                case "+" -> instructionsToSum(calculator);
                case "-" -> instructionsToSubtraction(calculator);
                case "*" -> instructionsToMultiple(calculator);
                case "E" -> {
                    System.out.println("Calculator is stopping!");
                    flag = false;
                }
                default -> flag = false;
            }
        }
    }

    private static void instructionsToSubtraction(Calculator calculator) {
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        int result = calculator.subtract(a, b);
        System.out.println(result);
    }

    private static void instructionsToSum(Calculator calculator) {
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        int result = calculator.add(a, b);
        System.out.println(result);
    }

    private static void printMenu() {
        //wypisz opcje
        System.out.println("""
                                   wybierz działanie:
                                   (+) dodawanie ...
                                   E exit
                                   """);
    }
    //TODO dodaj pętle i proste menu do obliczania. Możesz wykorzystać switch() jako menu, żeby użytkownik mógł coś wybierać, dodawanie, odejmowanie,
    // mnożenie i dzielenie(nie można dzielić przez 0),
    //Todo może dodasz ArrayList jako pamięć kalkulatora i będzie zapisywało wyniki jako kolejne rekordy, potem w menu głównym będzie można sprawdzić
    // wszystkie wyniki albo np ostatni

}