package Tasks.Day12_Switch;

public class Elevator {

    public static void main(String[] args) {


        int number = 2;

        //solution 1
        String result = "";
        if (number>=1&&number<=3){
            if (number==1){
                result="Floor 1 selected. \nCompanies: Lobby, Verizon, Starbucks";
            }else if (number==2){
                result="Floor 2 selected. \nCompanies: Cybertek, NASA, Intelsat";
            }else {
                result="Floor 3 selected. \nCompanies: Lyft, BofA, Stake house";
            }
        }else {
            System.out.println("Invalid floor");
        }

        System.out.println(result);

        System.out.println("---------------------------------------------------------");

        //solution 2

        switch (number){
            case 1:
                System.out.println("Floor 1 selected. \nCompanies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. \nCompanies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. \nCompanies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floar");
                break;
        }
        System.out.println("--------------------------------------------------------------------------");

        //solution 3

        if (number==1||number==2||number==3){

            switch (number){
                case 1:
                    System.out.println("Floor 1 selected. \nCompanies: Lobby, Verizon, Starbucks");
                    break;
                case 2:
                    System.out.println("Floor 2 selected. \nCompanies: Cybertek, NASA, Intelsat");
                    break;
                default:
                    System.out.println("Floor 3 selected. \nCompanies: Lyft, BofA, Stake house");
            }
        }else {
            System.out.println("İnvalid floar");
        }




    }
}
/*
 Create a class called Elevator.
 A variable named floorNumber is given, write a program that can display the floor info

			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */