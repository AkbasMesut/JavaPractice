package Tasks.Day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class Task02_CountEvenAndOddNumber {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 8, 1, 5, 3, 2, 11,};

        Arrays.sort(arr);

        String result1 = "";
        String result2 = "";

        for (int i : arr) {

            if (i % 2 == 0) {
                result1 += i + " ";
            } else {
                result2 += i + " ";
            }
        }
        System.out.println("Even numbers are " + result1);
        System.out.println("Odd numbers are " + result2);
    }
}
