package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task10_TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)? :");
        String yesOrNo = input.next().toLowerCase();

        System.out.println("Enter the number of people :");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount :");
        double amount = input.nextDouble();

        System.out.println("How was teh service quality? (Excellent/Great/Good/Fair/Poor) ");
        String service = input.next().toLowerCase();

        double tipRate = 0;
                if (service.equals("excellent")){
                    tipRate=0.25;
                }else if (service.equals("Great")){
                    tipRate=0.20;
                }else if (service.equals("Good")){
                    tipRate=0.15;
                }else if (service.equals("Fair")){
                    tipRate=0.10;
                }else {
                    tipRate=0.05;
                }

        double totalTip = amount*tipRate;

        System.out.println("numberOfPeople = " + numberOfPeople);
        System.out.println("Total to pay = " + amount);
        System.out.println("totalTip = " + totalTip);

        if (yesOrNo.equals("yes")){
            System.out.println("Total per person :"+ (amount/numberOfPeople));
            System.out.println("Tip per person : "+(totalTip/numberOfPeople));
        }
        input.close();
    }
}

/*
  Create a class called TipCalculator, write a program for a tip calculator.
  There will be different service quality benchmarks that will determine the tip given.
  There will also the ability to calculate based on the number of people in the party
  and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

  The program should display the following information based on the user input:
  Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
  Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */