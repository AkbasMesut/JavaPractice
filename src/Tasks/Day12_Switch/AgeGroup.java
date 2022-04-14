package Tasks.Day12_Switch;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = input.nextInt();

        String yourAge = "";
        if (age>=0 && age<=150){
            if (age<20){
                yourAge = "Teenager";
            }else if (age<55){
                yourAge = "Adult";
            }else {
                yourAge = "Senior";
            }
        }else {
            System.out.println("İnvalid İnput");
        }
        System.out.println(yourAge);
    }
}
/*
    Create a class called AgeGroups,
    write a program that can define the age groups of a person age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
