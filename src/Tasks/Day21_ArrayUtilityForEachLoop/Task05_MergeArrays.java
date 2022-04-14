package Tasks.Day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class Task05_MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] sum = new int[arr1.length + arr2.length + arr3.length];

        int i = 0;

        for (int i1 : arr1) {
            sum[i++] = i1;
        }
        for (int i2 : arr2) {
            sum[i++] = i2;
        }
        for (int i3 : arr3) {
            sum[i++] = i3;
        }
        System.out.println(Arrays.toString(sum));
    }
}

/*
     Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}

 */
