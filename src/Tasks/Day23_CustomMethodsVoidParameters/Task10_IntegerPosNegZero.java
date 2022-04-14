package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task10_IntegerPosNegZero {
    public static void main(String[] args) {

        integerStatus();

    }
    public static void integerStatus(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();

        if (number>0){
            System.out.println("Your number is positive");
        }else if (number<0){
            System.out.println("Your number is negative");
        }else {
            System.out.println("Zero");
        }

        input.close();
    }

}
