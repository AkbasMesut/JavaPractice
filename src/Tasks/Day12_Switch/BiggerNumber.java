package Tasks.Day12_Switch;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please first number : ");
        int num1 = input.nextInt();

        System.out.println("Please second number : ");
        int num2 = input.nextInt();

        System.out.println("Please third number : ");
        int num3 = input.nextInt();


        String bignumber =
                (num1!=num2 || num2!=num3 || num1!=num3)?(num1>num2 && num1>num3)?"num1 is bigger"
                            :(num2>num1 && num2>num3) ?"num2 is bigger" :"num3 is bigger" : "Your number is equal";

        System.out.println(bignumber);



        /*String bigNumber="";
        if (num1!=num2 && num2!=num3){
            if (num1>num2 && num1>num3){
                bigNumber="num1 is bigger";
            }else if (num2>num1 && num2>num3){
                bigNumber="num2 is bigger";
            }else {
                bigNumber="num3 is bigger";
            }
        }else{
            System.out.println("Your numbers are equal");
        }
        System.out.println(bigNumber);
        */


    }
}
/*
        Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */
