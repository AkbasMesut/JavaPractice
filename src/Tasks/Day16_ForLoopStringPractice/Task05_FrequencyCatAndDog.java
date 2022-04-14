package Tasks.Day16_ForLoopStringPractice;

public class Task05_FrequencyCatAndDog {

    public static void main(String[] args) {

        String str = "dog Cat  dOg dog DOG cat caT cat";

        int cat = 0;
        int dog = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String s = str.substring(i, i + 3);
            if (s.equalsIgnoreCase("dog")) {
                dog++;
            } else if (s.equalsIgnoreCase("cat")) {
                cat++;
            }
        }

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);

    }
}


/*

        write a program to print true if the string "cat" and "dog" appear
    the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */