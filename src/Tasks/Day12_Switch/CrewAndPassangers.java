package Tasks.Day12_Switch;

import java.util.Scanner;

public class CrewAndPassangers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter passenger numbers  : ");
        int number = input.nextInt();

        String totalNumber = "";

        if (number >= 1 && number <= 100) {
            if (number <= 50) {
                totalNumber = "20crew, 30 passenger";
            } else if (number <= 75) {
                totalNumber = "25 crew, 50 passengers";
            } else {
                totalNumber = "30 crew, 70 passengers";
            }
        } else {
            System.out.println("İnvalid Number");
        }
        System.out.println(totalNumber);
    }
}


/*
    Create a class called CrewAndPassangers,
    Given a number of people on the ship (int number),
    determine how many need to be crew members and how many can be passengers.
    Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
