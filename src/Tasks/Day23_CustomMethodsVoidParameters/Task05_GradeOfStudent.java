package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Scanner;

public class Task05_GradeOfStudent {

    public static void main(String[] args) {

        gradeOfStudent();

    }

    public static void gradeOfStudent(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade level :");
        byte number = input.nextByte();
        input.close();

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
