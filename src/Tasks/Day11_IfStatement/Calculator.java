package Tasks.Day11_IfStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = input.nextInt();

        System.out.println("Enter num2: ");
        double num2 = input.nextInt();

        System.out.println("Please Choose an Operator as (+, -, *, /): ");

        char mathOperator = input.next().charAt(0);


        if (mathOperator=='+'){
            System.out.println(num1+num2);
        }else if (mathOperator=='-'){
            System.out.println(num1-num2);
        }else if (mathOperator=='*'){
            System.out.println(num1*num2);
        }else {
            System.out.println(num1/num2);
        }

    }
}
/*
 package assignments;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Number 1: ");

        int n1 = input.nextInt();

        System.out.println("Please Enter Number 2: ");

        int n2 = input.nextInt();

        System.out.println("Please Choose an Operator as (+, -, *, /): ");

        char mathOperator = input.next().charAt(0);

        if (mathOperator == '+') {
            System.out.println(n1 + n2);
        } else if (mathOperator == '-') {
            if (n2 > n1) {
                n1 = -n1;
                n2 = -n2;
            }
            System.out.println(n1 - n2);
        } else if (mathOperator == '*') {
            System.out.println(n1 * n2);
        } else {
            System.out.println(n1 / n2);
        }

    }
    }

 Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */