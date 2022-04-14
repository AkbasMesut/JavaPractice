package Tasks.Day24_CustomMethodsReturnMethods;

public class Task05_FrequencyOfArrayNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,1,1,2,1};

        int ar = frequencyOfElement(arr,1);

        System.out.println(ar);


    }

    public static int frequencyOfElement(int[] arr, int element){

        int count =0;

        for (int i : arr) {

            if (i==element){
                count++;
            }
        }

        return count;

    }

}
