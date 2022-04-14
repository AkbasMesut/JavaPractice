package Tasks.Day27_WrapperClasses;

import java.util.Arrays;

public class Task01_Insert {

    public static void main(String[] args) {

        String[] ar = {"ali","veli","deli","ali"};

        ar = insert(ar, 1, "ali");

        System.out.println(Arrays.toString(ar));

    }
    //inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] array, int index, int newElement) {
        int[] result = new int[array.length];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        for (int i = 0, j=0; i < result.length; i++,j++) {
            result[i]=array[j];
            if (i == index) {
                result[index]=newElement;
            }
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] array, int index, double newElement) {
        double[] result = new double[array.length];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        for (int i = 0, j=0; i < result.length; i++,j++) {
            result[i]=array[j];
            if (i == index) {
                result[index]=newElement;
            }

        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] array, int index, char newElement) {
        char[] result = new char[array.length];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        for (int i = 0, j=0; i < result.length; i++,j++) {
            result[i]=array[j];
            if (i == index) {
                result[index]=newElement;
            }

        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static String[] insert(String[] array, int index, String newElement) {
        String[] result = new String[array.length];

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        for (int i = 0, j=0; i < result.length; i++,j++) {
            result[i]=array[j];
            if (i == index) {
                result[index]=newElement;
            }

        }
        return result;
    }
    
    
}

/*
Insert Task:
		1.1 Create a method named insert that passes three parameters:
		integer array, integer index, integer element.
		the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array


 */
