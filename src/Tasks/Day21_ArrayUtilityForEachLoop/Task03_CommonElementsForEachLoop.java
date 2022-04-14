package Tasks.Day21_ArrayUtilityForEachLoop;

public class Task03_CommonElementsForEachLoop {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int i : arr1) {
            for (int i1 : arr2) {
                if (i==i1){
                    System.out.print(i+" ");
                }
            }
        }


    }
}
