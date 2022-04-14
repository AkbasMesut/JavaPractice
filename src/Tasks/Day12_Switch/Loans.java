package Tasks.Day12_Switch;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Salary :");
        int salary= input.nextInt();

        System.out.println("Please enter your Credit Score :");
        int creditScore = input.nextInt();

        String result =
                (salary>=60000 && creditScore>=650) ? "Loan Approved":"Loan Denied";

        System.out.println(result);


    }
}
/*
        Create a class called Loans,
        Given two variables salary and credit score,
        use those given info to determine if you can get a loan.

        To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY
 */