package Tasks.Day17_BranchingWhileLoop;

import java.util.Scanner;

public class Task06_InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println("Enter your name :");
        String name = scan.nextLine();

        System.out.println("Enter your gender :");
        String gender = scan.nextLine().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid entry, please re enter your gender :");
            gender = scan.nextLine().toLowerCase();
        }

        System.out.println("Enter your age :");
        int age = scan.nextInt();

        while (!(age >= 0 && age <= 120)) {
            System.err.println("Invalid entry, please re enter your age :");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day? :");
        int miles = scan.nextInt();


        while (miles < 5) {
            System.err.println("Invalid entry, please re enter your miles :");
            miles = scan.nextInt();

        }
        scan.nextLine();

        System.out.println("Which type of insurance ?  Full coverage or liability :");
        String insurance = scan.nextLine().toLowerCase();

        while( !(insurance.equals("full coverage")||insurance.equals("liability"))){
            System.err.println("Invalid Entry, please re-enter! full coverage or liability?");
            insurance = scan.nextLine().toLowerCase();
        }

        System.out.println("Do you have any accidents or claims in past 5 years (yes/no) :");
        String accident = scan.nextLine().toLowerCase(); // ı am not sure how to handle this line....

        System.out.println("Do you have an anti-theft device in your car (yes/no) :");
        String antiTheft = scan.nextLine().toLowerCase();

        double InsuranceQuote = 0;

        if (insurance.equals("full coverage")) {
            if (age < 25) {
                InsuranceQuote = 160;
            } else {
                InsuranceQuote = 120;
            }
            if (miles <= 10) {
                InsuranceQuote += 20;
            } else if (miles <= 50) {
                InsuranceQuote += 40;
            } else {
                InsuranceQuote += 70;
            }

        }

        if (insurance.equals("liability")) {
            if (age < 25) {
                InsuranceQuote = 90;
            } else {
                InsuranceQuote = 50;
            }
            if (miles <= 10) {
                InsuranceQuote += 10;
            } else if (miles <= 50) {
                InsuranceQuote += 30;
            } else {
                InsuranceQuote += 50;
            }
        }
            double dicountRate = 0;

        if (accident.equals("yes")){
            dicountRate -= 0.15;
        }else {
            dicountRate += 0.1;
        }

        if (antiTheft.equals("no")){
            dicountRate += 0.05;
        }

        double totalPrice = InsuranceQuote*(1-dicountRate);

        System.out.println("Total Insurance :" + totalPrice);

        scan.close();
    }
}
