package Tasks.Day14_StringClass;

import java.util.Scanner;

public class Task19_Email2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email :");
        String email = input.nextLine();

        input.close();

        String first = email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf("_"));

        String last = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+
                email.substring(email.indexOf("_")+2,email.indexOf("@"));

        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println("First name : "+first);
        System.out.println("Last name : "+last);
        System.out.println("Domain : "+ domain);



    }

}


/*
        Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.
       Write a program that will print out information about user based on email. Print first name, last name, and domain.
       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */