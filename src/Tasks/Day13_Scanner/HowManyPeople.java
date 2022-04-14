package Tasks.Day13_Scanner;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter How many people do you live : ");
        int num = input.nextInt();

        if (num==1||num==2){
            System.out.println("Live with less than 3 people");
        }else if (num>=3 && num<=6){
            System.out.println("Live with 3-6 peole");
        }else {
            System.out.println("Live with more than 6 peole");
        }


    }
}
