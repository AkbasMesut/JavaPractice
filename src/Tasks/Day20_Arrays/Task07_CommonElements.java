package Tasks.Day20_Arrays;

public class Task07_CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};


        String result = "";
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

             if (arr1[i]==arr2[j]){
                 result += arr1[i]+",";

                }
            }

           // System.out.print(result);

        }

        System.out.println(result.substring(0,result.length()-1));

             //   actual result :  4,5,

             //   expected result : 4,5


    }
}
/*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */