package Tasks.Day17_BranchingWhileLoop;

import java.util.Scanner;

public class Task03_TwoNumberAndMathOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator");
        char op = scan.next().charAt(0);

        while (!(op == '-' || op == '+' || op == '*' || op == '/')) {
            System.out.println("Invalid Operator");
            op = scan.next().charAt(0);
        }
        double result = 0;

        if (op == '-') {
            result = num1 - num2;
        } else if (op == '+') {
            result = num1 + num2;
        } else if (op == '/') {
            result = num1 / num2;
        } else if (op == '*') {
            result = num1 * num2;
        }

        System.out.println(result);
    scan.close();
    }
}
/*
      write a program to ask user to enter two number and math operator, and return the result.

	if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */