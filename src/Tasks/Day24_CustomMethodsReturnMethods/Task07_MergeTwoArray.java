package Tasks.Day24_CustomMethodsReturnMethods;

import java.util.Arrays;

public class Task07_MergeTwoArray {

    public static void main(String[] args) {


        int[] a = {1,2,3};
        int[] b = {4,5,6};

        int[] c = merge(a,b);

        System.out.println(Arrays.toString(c));

    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+ arr2.length];

            int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }


}
