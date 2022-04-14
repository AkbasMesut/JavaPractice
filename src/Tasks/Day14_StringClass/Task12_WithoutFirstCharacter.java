package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task12_WithoutFirstCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word :");
        String firstWord = input.nextLine();

        System.out.println("Enter second word :");
        String secondWord = input.nextLine();
        input.close();

        String first = firstWord.substring(1,firstWord.length());

        String second = secondWord.substring(1,secondWord.length());

        System.out.println(first+""+second);





    }
}
/*
        Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */