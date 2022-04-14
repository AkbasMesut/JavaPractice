package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task04_eligibleToVote {

    public static void main(String[] args) {

        eligibleToVote();

    }

    public static void eligibleToVote() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scan.nextInt();
        System.out.println("What is your citizen");
        String citizen = scan.nextLine();
        citizen= scan.nextLine();
        scan.close();

        boolean isEligible = age >= 21 && citizen.equalsIgnoreCase("usa");

        if (isEligible) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }

}
