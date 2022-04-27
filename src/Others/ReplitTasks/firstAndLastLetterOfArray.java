package Others.ReplitTasks;

import java.util.Scanner;
public class firstAndLastLetterOfArray {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        input.close();

        for (String word : words) {
            System.out.print(word.charAt(0)+""+word.charAt(word.length()-1));
            System.out.println();
        }

    }


}
