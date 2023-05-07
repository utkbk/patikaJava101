package practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        // Calculator
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("1 - > Sum, 2 - > Subtraction, 3 - > Multiplication, 4 - > Division");
        int operation = input.nextInt();
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber / secondNumber;
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Result: " + result);
    }
}
