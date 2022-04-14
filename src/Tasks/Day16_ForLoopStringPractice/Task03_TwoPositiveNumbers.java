package Tasks.Day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task03_TwoPositiveNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();

        if (num1 > 0 && 0 < num2) {
            int result = 0;
            for (int i = 0; i < num1; i++) {
                result += num2;
            }

            System.out.println("Multipication =" + result);

        } else {
            System.out.println("Invalid Number");
        }

    }
}


/*
        Write a program that asks user to enter two positive numbers,
        then multiply those two numbers without using multiplication (*) operator.
      if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */