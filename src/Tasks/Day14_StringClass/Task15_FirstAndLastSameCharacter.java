package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task15_FirstAndLastSameCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word :");
        String first = input.next().toLowerCase();

        System.out.println("Enter second word :");
        String second = input.next().toLowerCase();
        input.close();

        char a = first.charAt(first.length() - 1);
        char b = second.charAt(0);
        String str2 = second.substring(1);

        if (a == b) {
            System.out.println(first + "" + str2);
        } else {
            System.out.println("Never mind !!!");
        }

    }

}


/*
       Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */