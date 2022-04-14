package Tasks.Day19_RecapLoopAndString;

import java.util.Scanner;

public class Task01_AreaAndPerimeterOfCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the radius of the circle :");
            double num = scan.nextInt();


            double result1 = 0;
            double result2 = 0;
            if (num < 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            } else {
                result1 = num * 3.14 * 2;
                result2 = num * num * 3.14;
            }
            System.out.println("Diameter of circle  :" + num * 2);
            System.out.println("Area of circle      :" + result2);
            System.out.println("Perimeter of circle :" + result1);

            System.out.println("\n Would you like to calculate another circle?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry, please re enter (yes/no)");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {

                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }


        }
        scan.close();
    }
}
