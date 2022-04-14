package Tasks.Day17_BranchingWhileLoop;

import java.util.Scanner;

public class Task05_RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String king = "$120";
        String queen = "$100";
        String single = "$80";

        while (true) {
            System.out.println("Do you want to reserve a room ?");
            String str = scan.next().toLowerCase();

            while (!(str.equals("yes") || str.equals("no"))) {

                System.err.println("Invalid entry, please re enter");
                str = scan.next().toLowerCase();

            }
            while (str.equals("yes")) {
                System.out.println("Which type of room do you want ?");
                str = scan.next().toLowerCase();

                if (str.equals("king")) {
                    System.out.println("King room :" + king);
                    break;
                } else if (str.equals("queen")) {
                    System.out.println("Queen room :" + queen);
                    break;
                } else if (str.equals("single")) {
                    System.out.println("Single room :" + single);
                    break;
                }

                while (!(str.equals("king") || str.equals("queen") || str.equals("single"))) {
                    System.err.println("Invalid entry, please re enter");
                    str = scan.next().toLowerCase();
                }

            }
            if (str.equals("no")) {
                System.out.println("Have nice a day...");
                break;
            }
                break;

        }
        scan.close();
    }

}



/*
      Create a class called Room Reservation, write a program for the room reservation,
      your program asks the user wants to reserve a room.
    if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    	(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */