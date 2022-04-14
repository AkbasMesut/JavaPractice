package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task09_Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = input.nextLine();
        input.close();

        int num = word.length();
        char e = word.charAt(4);
        char d = word.charAt(3);
        char c = word.charAt(2);
        char b = word.charAt(1);
        char a = word.charAt(0);

        if (num == '5') {
            System.out.println(e + "" + d + "" + "" + c + "" + b + "" + a);
        } else if (num > '5') {
            System.out.println("Too long");
        } else {
            System.out.println("Too short!");
        }

    }
}

/*
    Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.

	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */