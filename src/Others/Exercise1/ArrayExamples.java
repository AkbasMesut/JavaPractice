package Others.Exercise1;

public class ArrayExamples {

    // Write a function that can find the maximum number from an int Array
    public static int maxValue(int[] num) {
        int max = Integer.MIN_VALUE;
        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    // Write a function that can find the minimum number from an int Array
    public static int minValue(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int each : num) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }


    // write a program that can find the first duplicated number from the array
    public static int firstDublicateNum(int[] num) {
        int firstDublicate = 0;

        for (int each : num) {
            int frequency = 0;
            for (int each1 : num) {
                if (each == each1) {
                    frequency++;
                }
            }
            if (frequency > 1) {
                firstDublicate = frequency;
                break;
            }
        }
        return firstDublicate;
    }



     /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

     /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};

write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five

     */

     /*
    Largest Rectangular Area in a Histogram
    Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of
    a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

    For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}.
     The largest possible rectangle possible is 12
     */

    /*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

     */

     /*
    Write a return method that can concat two arrays
     */

     /*
    write a program that can move all the zeros to the end of an array
     */

     /*
    Write a function that can remove the duplicates from an array of integers
     */

     /*
    write a function that can reverse an array
     */


     /*
    write a function that returns second largest number
     */

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */

}
