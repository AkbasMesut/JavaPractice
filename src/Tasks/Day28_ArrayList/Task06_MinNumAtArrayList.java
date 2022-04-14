package Tasks.Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task06_MinNumAtArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(10,25,89,91,101));

        int min = number.get(0);
        for (Integer integer : number) {

            if (integer<min){
                min = integer;
            }
        }
        System.out.println(min);
    }
}
