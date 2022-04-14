package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task04_InitialOfUser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter  first word : ");
        String word1 = input.nextLine();

        System.out.println("Enter  second word : ");
        String word2 = input.nextLine();
        input.close();

        char first = word1.toUpperCase().charAt(0);
        char second = word2.toUpperCase().charAt(0);


        System.out.println(first + "." + second);
    }
}

/*
        write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */