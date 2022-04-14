package Tasks.Day11_IfStatement;

public class AgeGroups {

    public static void main(String[] args) {
        int age = 11;

        String ageGrup;

        if (age>=85){
            ageGrup ="Old Senior Citizen";
        }else if (age>=75){
            ageGrup = "Senior Citizen";
        }else if (age>=65){
            ageGrup = "Young Senior Citizen";
        }else if (age>=55){
            ageGrup = "Very Young Senior Citizen";
        }else if (age>=50){
            ageGrup = "Middle-Aged Adult";
        }else if (age>=40){
            ageGrup = "Young Middle-Aged Adult";
        }else if (age>=21){
            ageGrup = "Adult";
        }else if (age>=18){
            ageGrup = "Young Adult";
        }else if (age>=13){
            ageGrup = "Teenager";
        }else if (age>=10){
            ageGrup = "Pree-Teen";
        }else if (age>=6){
            ageGrup = "Kid";
        }else if (age>=3){
            ageGrup = "Toddler";
        }else {
            ageGrup = "infant";
        }

        System.out.println("Your age group = "+ageGrup);
    }
}
/*
Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */
