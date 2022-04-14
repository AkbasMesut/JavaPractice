package Tasks.Day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task01_PositiveNegativeNumbers {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int countPos= 0;
            int countNeg= 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number :");
            int num = input.nextInt(); // putting "int variable" inside the for loop, you can include it in cycle.

            if (num<0){
                 countNeg++;    //
            }else if (num>0){
                countPos++;     //
            }

        }
        System.out.println(countPos+" positive and "+countNeg+" negative.");
        input.close();
    }
}



/*
    Write a program that asks user to enter number for 5 times,
    and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */