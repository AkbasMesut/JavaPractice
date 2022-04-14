package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task13_LastTwoLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word :");
        String word = input.next();
        input.close();

        String lastTwo = word.substring(word.length() - 2);

        if (lastTwo.equals("ly")) {
            System.out.println("really");
        } else {
            System.out.println("never mind");
        }

    }
}


/*
        ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */