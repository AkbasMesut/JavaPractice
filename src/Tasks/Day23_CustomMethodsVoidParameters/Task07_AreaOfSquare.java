package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task07_AreaOfSquare {

    public static void main(String[] args) {

        areaOfSquare();

    }

    public static void areaOfSquare(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the square :");
        double side = input.nextDouble();
        input.close();

        double area = side * side;
        System.out.println("area = " + area);

    }

}
