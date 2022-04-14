package Tasks.Day20_Arrays;

import java.util.Arrays;

public class Task06_ZerosAtTheEndOfArray {

    public static void main(String[] args) {

        int[] arr = {10, 0, 5, 0, 1, 0};

        int[] arr1 = new int[arr.length];

        for (int i = 0, j=0; i < arr.length; i++) {

            if (arr[i] != 0) {

                arr1[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

}
      // arr1 : [10,5,1,0,0,0]





/*
        write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */