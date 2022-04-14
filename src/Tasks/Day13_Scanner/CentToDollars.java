package Tasks.Day13_Scanner;

import java.util.Scanner;

public class CentToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sends : ");
        int num =  input.nextInt();

        int dolar = num / 100;
        int cent = num % 100;

        System.out.println(num + " cents equal to : " + dolar + "$ and " + cent + " cents ");


    }

}


/*
               Write a program that can convert cents to dollars,
            if there is any remainder include them in the result as cents

            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */