package apps;

import apps.calculator.logic.Calculator;
import apps.calculator.history.ResultHistory;
import apps.userinterface.CalculatorApp;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ResultHistory resultHistory = new ResultHistory();
        Calculator calculator = new Calculator(resultHistory);

        CalculatorApp calculatorApp = new CalculatorApp(calculator, resultHistory);

        System.out.println("Calculator is starting!");
        boolean flag = true;
        while (flag) {
            calculatorApp.printMenu();
            switch (scanner.nextLine()) {
                case "+" -> calculatorApp.instructionsToSum(calculator);
                case "-" -> calculatorApp.instructionsToSubtraction(calculator);
                case "*" -> calculatorApp.instructionsToMultiple(calculator);
                case "/" -> calculatorApp.instructionsToDivision(calculator);
                case "H" -> calculatorApp.instructionsToHistory();
                case "E" -> {
                    System.out.println("Calculator is stopping!");
                    flag = false;
                }
                default -> flag = false;
            }
        }
    }
}