package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task07_AllWordsSame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word :");
        String word1 = input.nextLine();

        System.out.println("Enter second word :");
        String word2 = input.nextLine();

        System.out.println("Enter third word :");
        String word3 = input.nextLine();
        input.close();

        int num1 = word1.length();
        int num2 = word2.length();
        int num3 = word3.length();

        if (num2 == num1 && num2 == num3) {
            System.out.println("All words are same lenth.");
        } else if ((num1 != num2) && (num2 != num3) && (num1 != num3)) {
            System.out.println("All different length");
        } else {
            System.out.println("Not Same nor Different lengths");
        }
    }
}

/*
            Write a program  for CheckWords, the program accepts 3 words and :

	        - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */