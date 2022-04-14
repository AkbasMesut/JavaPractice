package Tasks.Day13_Scanner;

import java.util.Scanner;

public class ConvertMiles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles : ");
        double miles = input.nextDouble();

        double km = miles*1.09;

        System.out.println(miles + " miles equals to " + km + " kilometers ");

        input.close();

    }
}
/*
                Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */