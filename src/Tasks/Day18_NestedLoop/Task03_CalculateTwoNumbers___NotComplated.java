package Tasks.Day18_NestedLoop;

import java.util.Scanner;

public class Task03_CalculateTwoNumbers___NotComplated {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter a math operator (+,-,/,*) :");
        char op = scan.next().charAt(0);

        while (!(op == '+' || op == '-' || op == '/' || op == '*')) {
            System.err.println("Invalid entry ");
            System.out.println("Enter a math operator (+,-,/,*) :");
            op = scan.next().charAt(0);
        }

        System.out.println("Enter second number :");
        int num2 = scan.nextInt();
        scan.nextLine();

        int total = 0;

        total = (op == '+') ? num1 + num2 : (op == '-') ? num1 - num2 : (op == '/') ? num1 / num2 : num1 * num2;

        System.out.println("Result is " + total);

        System.out.println("Would you like to continue ?");
        String answer = scan.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry");
            System.out.println("Would you like to continue ? (yes / no) :");
            answer = scan.nextLine().toLowerCase();
        }

        while (answer.equals("yes")) {
            System.out.println("Enter first number :");
            num1 = scan.nextInt();

            System.out.println("Enter a math operator (+,-,/,*) :");
            op = scan.next().charAt(0);

            while (!(op == '+' || op == '-' || op == '/' || op == '*')) {
                System.err.println("Invalid entry ");
                System.out.println("Enter a math operator (+,-,/,*) :");
                op = scan.next().charAt(0);
            }

            System.out.println("Enter second number :");
            num2 = scan.nextInt();

            total = 0;
            total = (op == '+') ? num1 + num2 : (op == '-') ? num1 - num2 : (op == '/') ? num1 / num2 : num1 * num2;
            System.out.println("Result is " + total);

            break;
        }
        System.out.println("Thanks for using Cydeo calculator!");

        scan.close();

    }
}


/*
        Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


 */