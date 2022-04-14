package Others.ReplitTasks;

import java.util.Scanner;

public class RepeatSeparator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();


        for (int i = 0; i < count; i++) {

            if (i!=count-1){
                System.out.print(word.concat(separator)); // merge two string
            }else {
                System.out.print(word);
            }

        }








    }
}
