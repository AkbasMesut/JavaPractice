package Tasks.Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task05_MaxNumAtArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(10,25,89,91,101));

        int max =0;
        for (Integer integer : number) {
            if (integer>max){
                max = integer;
            }
        }
        System.out.println("max = " + max);
    }
}

/*
     Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */
