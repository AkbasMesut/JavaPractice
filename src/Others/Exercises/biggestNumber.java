package Others.Exercises;


import java.util.Arrays;
import java.util.Scanner;

public class biggestNumber {


    public static void main(String[] args) {


        String[] arr = {"zero", "one", "two","three","four"};


        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")){
                count++;
            }
        }
        String[] fewValues = new String[count];
        int i =0;
        for (String each : arr) {

            if (each.contains("e")){

                fewValues[i] = each;
                i++;
            }
        }

        System.out.println(Arrays.toString(fewValues));



    }
}


