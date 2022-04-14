package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task05_LastThreeCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word : ");
        String sentence = new Scanner(System.in).nextLine();
        input.close();

        int num = sentence.length();
        String result = "";

        if (num == 0) {
            result = "empty";
        } else if (num > 3) {
            result = "" + sentence.charAt(num - 3) +""+ sentence.charAt(num - 2) +""+ sentence.charAt(num - 1);
        } else {
            result = sentence;
        }

        System.out.println(result);
    }
}

/*
        Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */