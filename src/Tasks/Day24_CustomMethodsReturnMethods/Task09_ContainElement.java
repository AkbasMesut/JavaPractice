package Tasks.Day24_CustomMethodsReturnMethods;

public class Task09_ContainElement {

    public static void main(String[] args) {

    int[] arr = {1,2,355,45,85};

        boolean a = contain(arr,45);

        System.out.println(a);


    }

    public static boolean contain (int[] array, int ar){
        boolean result = false;

        for (int each : array) {

            if (each==ar){
                result = true;
            }
        }
        return result;
    }
}


/*
       Create a method named contains that passes one integer array and one integer parameters,
 the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */