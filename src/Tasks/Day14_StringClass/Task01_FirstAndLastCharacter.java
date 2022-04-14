package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task01_FirstAndLastCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence here : ");

        String sentence = input.nextLine();
        input.close();

        char first = sentence.charAt(0);
        char lastOne=sentence.charAt(sentence.length()-1);



        System.out.println("first = "+ first);
        System.out.println("lastOne = " + lastOne);

    }
}


/*
                write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */