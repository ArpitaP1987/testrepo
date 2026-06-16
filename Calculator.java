import java.util.Scanner;

/**
 * A simple console-based arithmetic calculator.
 * Supports addition, subtraction, multiplication, division, and modulus.
 */
public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot take modulus by zero");
        }
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Arithmetic Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        try {
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                case '%':
                    result = modulus(num1, num2);
                    break;
                default:
                    System.out.println("Error: Invalid operator '" + operator + "'");
                    scanner.close();
                    return;
            }
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
