package Tasks.Day18_NestedLoop;

import java.util.Scanner;

public class Task02_RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int king = 120;
        int queen = 100;
        int single = 80;
        int total = 0;

        System.out.println("King   = 120$");
        System.out.println("Queen  = 100$");
        System.out.println("Single = 80$");

        System.out.println("Which bedroom would you like to reserve :");
        String room = scan.nextLine().toLowerCase();

        while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
            System.err.println("Invalid entry, please re-enter ");
            room = scan.nextLine().toLowerCase();
        }

        System.out.println("How many night do you stay ?");
        int stay = scan.nextInt();
        scan.nextLine();

        System.out.println("Would you like to reserve another room ?");
        String anotherRoom = scan.nextLine().toLowerCase();

        while (!(anotherRoom.equals("yes")||anotherRoom.equals("no"))){
            System.err.println("Invalid entry");
            System.out.println("Would you like to reserve another room ?");
            anotherRoom = scan.nextLine().toLowerCase();
        }

        if (anotherRoom.equals("no")) {

            total = (room.equals("king")) ? king * stay : (room.equals("queen")) ? queen * stay : single * stay;
            System.out.println(total);

        } else {
            total = (room.equals("king")) ? king * stay : (room.equals("queen")) ? queen * stay : single * stay;

            System.out.println("Which bedroom would you like to reserve :");
            room = scan.nextLine().toLowerCase();

            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.err.println("Invalid entry, please re-enter ");
                room = scan.nextLine().toLowerCase();
            }

            System.out.println("How many night do you stay ?");
            stay = scan.nextInt();
            scan.nextLine();

            total += (room.equals("king")) ? king * stay : (room.equals("queen")) ? queen * stay : single * stay;
            System.out.println(total);
        }

        scan.close();
    }
}
/*

        Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */