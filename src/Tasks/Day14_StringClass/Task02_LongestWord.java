package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task02_LongestWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word : ");
        String word1= input.nextLine();

        System.out.println("Enter second word : ");
        String word2= input.nextLine();
        input.close();


        if (word1.length()>word2.length()){
            System.out.println("longest = "+word1);
        }else if (word2.length()>word1.length()){
            System.out.println("longest = "+word2);
        }else {
            System.out.println("They are the same");
        }




    }
}
/*
    write a program that asks user to enter two strings, and print out the longest string

          package day13_String;

        import java.util.Scanner;

        public class Task_02
        {
        public static void main(String[] args)
        {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first sentence:");
        String first = scan.nextLine();
        System.out.println("Enter second sentence:");
        String second = scan.nextLine();
        if(first.length()>second.length()){
            System.out.println(first);
        }else{
            System.out.println(second);
        }

    }
}

 */