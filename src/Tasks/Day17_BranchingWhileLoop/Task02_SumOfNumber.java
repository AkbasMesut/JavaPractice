package Tasks.Day17_BranchingWhileLoop;

import java.util.Scanner;

public class Task02_SumOfNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number  :");
            int num1 = scan.nextInt();
            System.out.println("Enter second number :");
            int num2 = scan.nextInt();

            if (num1 < 0 || num2 < 0) {
                break;
            }

            System.out.println(num1 + num2);
        }


        scan.close();
    }

}


/*
        Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */