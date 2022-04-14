package Tasks.Day15_ForLoop;

import java.util.Scanner;

public class Task05_DigitNumberLetter {

        public static void main(String[] args) {

            System.out.println("Enter any character :");
            String str= new Scanner(System.in).next();


        String digit = "";
        String letter ="";
        String special ="";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch<='9' && '0'<=ch){
                        digit +=ch;
                }else if (ch>='A'&&'Z'>=ch){
                        letter +=ch;
                }else if (ch>='a'&&'z'>=ch){
                    letter += ch;
                }else {
                    special +=ch;
                }

            }
            System.out.println("digit = " + digit);
            System.out.println("letter = " + letter);
            System.out.println("special = " + special);
    }
}
/*
            write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */