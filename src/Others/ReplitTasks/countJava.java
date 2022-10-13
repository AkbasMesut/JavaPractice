package Others.ReplitTasks;

import java.util.Scanner;

public class countJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        int lastIndex = 0;
        int count =0;
        while (lastIndex!=-1){

            lastIndex = word.indexOf("java",lastIndex);
            if (lastIndex!=-1){
                count++;
                lastIndex += "java".length();
            }
        }
        System.out.println(count);
    }


}
/*
count "java" word in thr given string

 */