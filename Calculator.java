import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        
        System.out.print("Enter operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = Math.abs(num1 - num2);
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not possible.");
                    return;
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("Invalid operator.");
                valid = false;
                result = 0;
        }

     
        if (valid) {
            System.out.printf("Result: %.3f\n", result);
        }
    }
}
