package Tasks.Day12_Switch;

public class CappucinoBuyer {
    public static void main(String[] args) {

        //solution 1

        String size = "grande";

        if (size=="tall"||size=="grande"||size=="venti"){
            if (size=="tall"){
                System.out.println("price is $3.69\n90 calories");
            }else if (size=="grande"){
                System.out.println("price is $3.99\n120 calories");
            }else {
                System.out.println("price is $4.29\n150 calories");
            }
        }else {
            System.out.println("Invalid Size");
        }

        System.out.println("---------------------------------------------");

        //solution 2

        switch (size){

            case "tall":
                System.out.println("price is $3.69\n90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99\n120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29\n150 calories");
                break;
            default:
                System.out.println("Invalid Size");
        }

        System.out.println("------------------------------------------------------");

        //solution 3

        if (size=="tall"||size=="grande"||size=="venti"){
            switch (size){
                case "tall":
                    System.out.println("price is $3.69\n90 calories");
                    break;
                case "grande":
                    System.out.println("price is $3.99\n120 calories");
                    break;
                case "venti":
                    System.out.println("price is $4.29\n150 calories");
            }

        }else {
            System.out.println("Invalid Size");
        }

    }
}







/*

	 1. Create a class called  CappuccinoBuyer. A variable named Size is given,
	    write a program that can display the price and calories of cappuccino
		Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */