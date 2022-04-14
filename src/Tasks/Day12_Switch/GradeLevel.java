package Tasks.Day12_Switch;

import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade level");
        byte number = input.nextByte();

        String gradeLevel = "";
        if (number>=1 && number <=18){
            if (number<=5){
                gradeLevel = "Elementary school";
            }else if (number<=8){
                gradeLevel = "Middle School";
            }else if (number<=12){
                gradeLevel = "High School";
            }else if (number<=16){
                gradeLevel = "Collage";
            }else {
                gradeLevel = "Grad School";
            }
        }else {
            System.out.println("İnvalid number");
        }
        System.out.println(gradeLevel);
    }
}
/*
 Create a class called GradeLevel,
 Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given
 */
