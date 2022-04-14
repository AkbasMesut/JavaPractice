package Tasks.Day18_NestedLoop;

public class Task05_FrequencyOfUniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                //  char each = str.charAt(j);
                if (ch == str.charAt(j)) {
                    count++;
                }

            }

            if (count != 1) {
                continue;
            }

            result += ch;     // ab

        }

        System.out.println(result);

    }
}
/*
        Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique


 */