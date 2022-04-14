package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task03_FirstAndLastCharakterSame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word : ");
        String word = input.nextLine();
        input.close();


        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        if (first==last){
            System.out.println("They are the same.");
        }else {
            System.out.println("They are not the same.");
        }


    }
}
/*
        write a program that can check
        if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */