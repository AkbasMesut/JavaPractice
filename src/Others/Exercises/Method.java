package Others.Exercises;

import java.util.Scanner;

public class Method {

    public static void factorial(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int number = scan.nextInt();

        int factorial =1;

        while (number>0){
            factorial *= number;
            number--;
        }

        System.out.println("The factorial of your number is "+factorial);

    }

    public static void greeding(String name){

        System.out.println("Hello" + name);
    }

    public static int mul3(int a){
        return a*3;
    }

    public static int minus5(int a){
        return a-5;
    }




    public static void main(String[] args) {

        greeding("Mesut");

        System.out.println(minus5(mul3(3)));

        System.out.println("");
        factorial();




    }





}
