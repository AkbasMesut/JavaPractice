package Tasks.Day20_Arrays;

import java.util.Arrays;

public class Task05_ReversedIntegers {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] reversed = new int[arr.length];

        for (int i =arr.length-1, j=0 ; i >=0 ; i--) {
                reversed[j] =arr[i];
                   j++;
        }



        System.out.println(Arrays.toString(reversed));
    }
}

        //  reversed : [5,4,3,2,1]