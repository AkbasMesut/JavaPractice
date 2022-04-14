package Others.NotUnderstand;

import java.util.Scanner;

public class Num02_CatAndDog {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        int lastIndex;

        String word = scan.next();

        //for cats
        lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = word.indexOf("cat", lastIndex);

            if (lastIndex != -1) {
                countOfCats++;
                lastIndex += "cat".length();
            }
        }

        //for dogs
        lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = word.indexOf("dog", lastIndex);

            if (lastIndex != -1) {
                countOfDogs++;
                lastIndex += "dog".length();
            }
        }

        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
