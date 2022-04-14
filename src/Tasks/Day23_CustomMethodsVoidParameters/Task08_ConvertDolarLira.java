package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task08_ConvertDolarLira {

    public static void main(String[] args) {
    convertDollarToLira();

    }
    public static void convertDollarToLira(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter dollar :");
        double dollar = input.nextDouble();

        double lira = dollar*15;

        System.out.println(dollar+" dollars ="+ lira+" liras");

    }

}
