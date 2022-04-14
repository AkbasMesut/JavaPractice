package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task09_ConvertKgToLb {

    public static void main(String[] args) {

        convertKgToLb();
    }
    public static void convertKgToLb(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Kg :");
        double kg = input.nextDouble();

        double lb = kg * 0.45;

        System.out.println(lb+" libras = "+kg+" kilograms.");
        input.close();
    }
}
