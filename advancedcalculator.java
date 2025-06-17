import java.util.Scanner;

public class advancedcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Advanced Calculator ===");
        System.out.println("Operations: +  -  *  /  %  ^  sqrt  exit");

        while (true) {
            System.out.print("\nEnter operation: ");
            String operation = scanner.next().toLowerCase();

            if (operation.equals("exit")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double num1, num2, result;

            switch (operation) {
                case "+":
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case "-":
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case "*":
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case "/":
                    System.out.print("Enter numerator: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case "%":
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                    break;

                case "^":
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case "sqrt":
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Cannot take square root of a negative number.");
                    }
                    break;

                default:
                    System.out.println("Invalid operation. Try again.");
            }
        }

        scanner.close();
    }
}