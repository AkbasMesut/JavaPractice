package Tasks.Day16_ForLoopStringPractice;

public class Task04_FrequencyOfWord {

    public static void main(String[] args) {

        String str = "Hellohellomellomello";

        int count =0;

        for (int i = 0; i <= str.length()-5; i++) {
            String s = str.substring(i,i+5);
            if (s.equalsIgnoreCase("Hello")){
                count++;
            }
        }

        System.out.println(count);

    }
}
/*
        write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */