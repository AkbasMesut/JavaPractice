package Tasks.Day11_IfStatement;

public class GradeLevel {
    public static void main(String[] args) {

        int age = 11;

        boolean Elementary = 1<= age && age <=5;
        boolean Middle  = 6<= age && age <= 8;
        boolean High   = 9<= age && age <= 12;
        boolean College = 13<= age && age <= 16;
        boolean Grad = 17<= age && age <= 18;

        if (Elementary){
            System.out.println("Your grade is Elementary");
        }
        if (Middle){
            System.out.println("Your grade is Middle");
        }
        if (High){
            System.out.println("Your grade is High");
        }
        if (College){
            System.out.println("Your grade is College");
        }
        if (Grad){
            System.out.println("Your grade is Grade");
        }


    }
}

/*
   Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */