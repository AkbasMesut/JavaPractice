package Tasks.Day11_IfStatement;

import java.util.Scanner;

public class BuyCigarette {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor age: ");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("You can buy a cigarette.");
        }
        if (age < 18){
            System.out.println("You can't buy a cigarette.");
        }
    }
}
/*

	1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

 */