package Tasks.Day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class Task01_DescendingOrder {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 5, 3, 2, 11,};

        Arrays.sort(arr);

        int[] reversed = new int[arr.length];

        for (int i = arr.length-1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }

        System.out.println(Arrays.toString(reversed));
    }
}
