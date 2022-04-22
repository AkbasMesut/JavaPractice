package Others.Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer integer : list) {
            if (integer%2!=0){
                continue;
            }
            System.out.println(integer+"");
            break;
        }

    }


}
