package Tasks.Day15_ForLoop;

import java.util.Scanner;

public class Task03_SumOfAnyNumber {

    public static void main(String[] args) {


        System.out.println("Enter any number :");
        int num = new Scanner(System.in).nextInt();

           if (num<0){
               System.out.println("Invalid Number");
           }else {
               int sum = 0;
               for (int i = 1; i <= num; i++) {
                   sum += i;
               }
               System.out.println("sum = " + sum);

           }




    }
}

/*
        write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */