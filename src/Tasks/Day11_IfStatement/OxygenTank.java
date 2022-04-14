package Tasks.Day11_IfStatement;

import java.util.Scanner;

public class OxygenTank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number between 50 - 100 : ");
        int num = input.nextInt();

        if (num>=90){
            System.out.println("Your tank is full");
        }else if (num>=80 && num<90){
            System.out.println("Still okay");
        }else if (num>=70 && num<80){
            System.out.println("Don't too far");
        }else if (num>=60 && num<70){
            System.out.println("Start to head back");
        }else if (num==50){
            System.out.println("Be careful now you at 50%");
        }


    }
}

/*
            Create a class called OxygenTank. You are diving in the ocean.
            Your oxygen tank has a certain level (number) and you must print a message based on the level:

                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you  at 50%

                USE ONE PRINT STATEMENT ONLY
 */