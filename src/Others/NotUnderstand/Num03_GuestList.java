package Others.NotUnderstand;

import java.util.Scanner;

public class Num03_GuestList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guest="";
        String guests="";
        String reply;


        do
        {
            System.out.println("Please enter guest name:");
            guest = input.nextLine();
            guests = guests + guest + ", ";

            System.out.println("Do you want to enter new guest name:");
            reply=input.nextLine();
        }
        while(reply.equals("yes"));

        System.out.println("Guest's list: " + guests.substring(0,guests.length()-2));

    }



}
