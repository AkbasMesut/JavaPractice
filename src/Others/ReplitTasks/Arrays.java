package Others.ReplitTasks;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }

        for (String s : arr) {
            s=s.substring(0,3);
            System.out.println(s);
        }



    }
}
