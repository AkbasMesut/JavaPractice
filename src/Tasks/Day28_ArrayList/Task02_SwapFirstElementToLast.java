package Tasks.Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task02_SwapFirstElementToLast {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(number.get(0));

        number.set(0, number.get(4));
        number.set(number.size()-1, temp.get(0) );

        System.out.println("number = " + number);
        System.out.println("temp = " + temp);


    }
}
/*

     write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */