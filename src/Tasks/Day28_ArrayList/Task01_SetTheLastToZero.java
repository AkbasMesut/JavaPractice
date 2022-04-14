package Tasks.Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01_SetTheLastToZero {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(1,2,3,4,5));

        number.set(4,0);

        System.out.println("number = " + number);

    }
}
/*
write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

 */