package Others.ReplitTasks;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                System.out.print(ch);
            }


        }



    }
}
