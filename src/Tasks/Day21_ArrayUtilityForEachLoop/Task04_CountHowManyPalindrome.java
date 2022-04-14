package Tasks.Day21_ArrayUtilityForEachLoop;

public class Task04_CountHowManyPalindrome {

    public static void main(String[] args) {

        String[] str = {"anna", "level", "Java"};

        int result = 0;
        for (String s : str) {

            String reversed = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
            if (reversed.equals(s)) {
                result++;
            }
        }
        System.out.println(result);
    }
}



/*
     write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */