package Tasks.Day19_RecapLoopAndString;

import java.util.Scanner;

public class Task05_SalaryCalculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("How much you make an hour ?");
            int hourlyrate = scan.nextInt();

            if (hourlyrate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work in a week?");
            int weeklyHours = scan.nextInt();

            if (weeklyHours < 1 || weeklyHours > 144) {
                System.err.println("Invalid Entry for Weekly Rate");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double stateRate = scan.nextDouble();

            if (stateRate < 0 || stateRate > 0.1) {
                System.err.println("Invalid Entry for State Tax Rate");
                System.exit(0);
            }

            int grossSalary = hourlyrate * weeklyHours * 52;
            double stateTax = grossSalary * stateRate / 100;
            double federalTax = grossSalary * (0.26 / 100);
            double totalTax = stateTax + federalTax;
            double salaryAfterTax = grossSalary - totalTax;

            System.out.println("Gross pay is = $" + grossSalary);
            System.out.println("State tax    = $" + stateTax);
            System.out.println("Federal tax  = $" + federalTax);
            System.out.println("Net income   = $" + salaryAfterTax);

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                System.out.println("Thank you for using Cydeo salary calculator app!");
                break;
            }

        }

    scan.close();
    }
}
