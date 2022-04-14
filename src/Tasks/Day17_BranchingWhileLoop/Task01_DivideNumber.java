package Tasks.Day17_BranchingWhileLoop;

import java.util.Scanner;

public class Task01_DivideNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int count = 0;

        while (num1>=num2){

            num1 -= num2;
            count++;
        }

        System.out.println(count);

        scan.close();
    }
}

/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */