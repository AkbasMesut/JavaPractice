package Tasks.Day27_WrapperClasses;

import java.util.Arrays;

public class Task02_Swap {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        arr = swap(arr,0,1);

        System.out.println(Arrays.toString(arr));


    }
    //swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap (int[] array, int i , int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;


        return array;
    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap (double[] array, int i , int j){

        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;


        return array;
    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap (char[] array, int i , int j){

        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;


        return array;
    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap (String[] array, int i , int j){

        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;


        return array;
    }
}
