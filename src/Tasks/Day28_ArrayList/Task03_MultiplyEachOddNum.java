package Tasks.Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task03_MultiplyEachOddNum {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(3,2,2,4,3));

        for (int i = 0; i < number.size(); i++) {

            if (number.get(i)%2!=0){
                number.set(i,number.get(i)*2);
            }
        }

        System.out.println("number = " + number);
    }
}
/*
      write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */
