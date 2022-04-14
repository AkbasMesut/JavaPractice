package Tasks.Day21_ArrayUtilityForEachLoop;

public class Task06_FrequencyOfWords {

    public static void main(String[] args) {

        String str = "Python is an ideal choice for beginners as the language is more intuitive," +
                   " and its syntax is very much similar to the English language. Its open-source nature " +
                   "facilitates a slew of new tools that improve it.On the other hand, Java is a general-purpose " +
                "programming language that was designed with a specific goal of allowing developers to write once run anywhere.";

        String[] sentence = str.split(" ");

        int countJava   = 0;
        int countPython = 0;
        int countLanguage =0;

        for (String s : sentence) {

            if (s.equalsIgnoreCase("python")){
                countPython++;
            }
            if (s.equalsIgnoreCase("java")){
                countJava++;
            }
            if (s.equalsIgnoreCase("language")){
                countLanguage++;
            }

        }

        System.out.println(countJava+" Java, "+countPython+" Python and "+countLanguage+" language.");

    }
}
/*
    Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */