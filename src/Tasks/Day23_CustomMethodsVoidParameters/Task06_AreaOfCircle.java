package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task06_AreaOfCircle {

    public static void main(String[] args) {

    areaOfCircle();



    }
    public static void areaOfCircle(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double r = input.nextDouble();

        double area = r * r * 3.14;
   //     double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
     //  System.out.println("perimeter = " + perimeter);

        input.close();

    }

}
