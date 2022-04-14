package Tasks.Day11_IfStatement;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n\n Please enter a number for your language selection :");

        int op = input.nextInt();

        if (op==1){
            System.out.println("\n Hello, thank for your call");
        }else if (op==2){
            System.out.println("\n Hola, gracias para llamar ");
        }else if (op==3){
            System.out.println("\n Merhaba, aradığınız için teşekkürler ");
        }else if (op==4){
            System.out.println("\n Privet, spasibo za vash zvonok ");
        }else {
            System.out.println("\n Merci ,pour votre appel ");
        }

    }
}

/*
        Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
 Write a program that can select the language based on the number that's given in selection and prints the following
 message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel


 */