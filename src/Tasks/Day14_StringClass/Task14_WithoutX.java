package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task14_WithoutX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word :");
        String word = input.next();
        input.close();

        char first = word.charAt(0);
        String second = word.substring(1);

        if (first == 'x') {
            System.out.println(second);
        }

    }
}

/*
       Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */