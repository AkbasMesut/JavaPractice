package Tasks.Day15_ForLoop;

import java.util.Scanner;

public class Task04_FactorialNumber {

    public static void main(String[] args) {


        System.out.println("Enter positive number : ");
        int num = new Scanner(System.in).nextInt();

        int sum =1;
        for (int i = 1; i <= num; i++) {
            sum *=i;
        }
        System.out.println("sum = " + sum);
    }
}

/*
            Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */