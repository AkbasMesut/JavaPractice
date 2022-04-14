package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task11_PrintEachChar {

    public static void main(String[] args) {



    }

    public static void printEachChar(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word :");
        String str = scan.nextLine();
        scan.close();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
}
