package Others.ReplitTasks;

import java.util.Scanner;

public class EqualsJavaPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        scan.close();

        int countOfJava  = 0;
        int countOfpython =0;
        int lastindex;

            lastindex =0;
        while (lastindex !=-1){
            lastindex = sentence.indexOf("python",lastindex);

            if (lastindex!=-1){
                countOfJava++;
                lastindex += "python".length();
            }
        }
        lastindex =0;
        while (lastindex !=-1){
            lastindex = sentence.indexOf("java",lastindex);

            if (lastindex!=-1){
                countOfpython++;
                lastindex += "java".length();
            }
        }

        if (countOfJava==countOfpython){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }
}
/*
            Given a string, print out true if the number of appearances of "java" anywhere
in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive)
 */