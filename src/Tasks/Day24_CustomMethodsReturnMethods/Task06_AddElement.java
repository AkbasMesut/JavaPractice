package Tasks.Day24_CustomMethodsReturnMethods;

import java.util.Arrays;

public class Task06_AddElement {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(addElement(new int[]{1, 2}, 2)));

    }

    public static int[] addElement(int[] arr, int add) {

        int[] result = new int[arr.length + 1];

        result[result.length - 1] = add;

        for (int i = 0, j = 0; i < result.length - 1; i++, j++) {

            result[i] = arr[j];
        }
        return result;
    }

}
