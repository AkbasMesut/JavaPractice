package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task06_ThreeCharacterWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three word : ");
        String str = input.nextLine();
        input.close();

        int num = str.length();
        char word = str.charAt(1);

        String result = "";
        if (num > 3) {
            result = "Word is too long";
        } else if (num == 3) {
            if (word == 'a') {
                result = "Cool word";
            } else {
                result = "Okay word";
            }
        } else {
            result = "Word is too short.";
        }

        System.out.println(result);
    }
}

/*
            write a program that asks the user enter a three letter word.
        Check if the middle character of the given word is 'a'.
        In the case it is print: "Cool word",
        but in the case the middle letter is not 'a' print: "Okay word".

	   - If the user does not enter a 3 letter word tell them:
          If the word is less than 3 letters: "Word is too short"
          If the word is too long: "Word is too long"
 */