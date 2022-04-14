package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task03_EligibleBuyAlcohol {

    public static void main(String[] args) {

        eligibleBuyAlcohol();

    }

    public static void eligibleBuyAlcohol(){

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
        scan.close();

        if (age>=18){
            System.out.println("Your are eligible to buy alcohol ");
        }else {
            System.out.println("Your are not eligible to buy alcoho");
        }
    }

}
