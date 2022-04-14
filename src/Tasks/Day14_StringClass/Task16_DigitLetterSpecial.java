package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task16_DigitLetterSpecial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word :");
        String first = input.next();

        input.close();

        char ch = first.charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("first character is digit");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("first character is lowercase letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("first character is uppercase letter");
        } else {
            System.out.println("first character is special character");
        }


    }

}


/*
         Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */