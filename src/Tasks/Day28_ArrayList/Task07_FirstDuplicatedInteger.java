package Tasks.Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task07_FirstDuplicatedInteger {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(10,25,89,25,101,10,91,89));

        int result = 0;
        for (int i = 0; i < number.size(); i++) {

            int frequency = 0;
            for (int j = 0; j < number.size(); j++) {
                if (number.get(i)== number.get(j)){
                   frequency++;
                }
            }
            if (frequency>1){
                result = number.get(i);
                break;
            }
        }

        System.out.println("result = " + result);

    }
}
