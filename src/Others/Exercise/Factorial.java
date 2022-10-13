package Others.Exercise;

import java.util.Scanner;

public class Factorial {


    public static void factorial(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Number : ");

        int num = scan.nextInt();

        int a = 1;

        while (num > 0){

         a *= num;
         num--;

        }

        System.out.println("Factorial :" + a);



    }

}
