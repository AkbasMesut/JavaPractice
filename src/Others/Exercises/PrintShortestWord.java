package Others.Exercises;

import java.util.Arrays;

public class PrintShortestWord {

    public static void main(String[] args) {

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] words = str.split(", ");

        String shortestWord = words[0];
        for (String eachWord : words) {

            if (shortestWord.length()>eachWord.length()){
               shortestWord = eachWord;
            }
        }

        int countOfShortest = 0;
        for (String eachWord : words) {
            if (shortestWord.length()==eachWord.length()){
                countOfShortest++;
            }
        }

        String[] shortestWordArr = new String[countOfShortest];

        int i =0;
        for (String eachWord : words) {
            if (shortestWord.length()==eachWord.length()){
                shortestWordArr[i] = eachWord;
                i++;
            }
        }

        Arrays.sort(shortestWordArr);

        System.out.println(Arrays.toString(shortestWordArr));



    }

}
