package Tasks.Day28_ArrayList;

import java.util.ArrayList;

public class Task04_CombineTwoStringToArrayList {

    public static void main(String[] args) {

        String[] str1 = {"A","B","C","D"};
        String[] str2 = {"E","F","G","H"};

        ArrayList<String> list = new ArrayList<>();

        for (String each : str1) {
            list.add(each);
        }

        for (String each : str2) {
            list.add(each);
        }

        System.out.println(list);

    }
}




/*
       write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */
