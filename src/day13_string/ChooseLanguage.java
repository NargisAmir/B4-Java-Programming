package day13_string;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please,choose one of the options below: ");
        System.out.println("\t1 - English\n\t2 - Spanish\n\t3 -Turkish\n\t4- RUssian\n\t5 - French \n\t6 -Azerbaijan\n\n\tYourOption: ");

        int userOption = key.nextInt();
        //Option 1 -with else if
        if (userOption == 1) {
            System.out.println("hello,thankks for your call: ");

        } else if (userOption == 2) {
            System.out.println("Hola,gracias para lam");
        } else if (userOption == 3) {
            System.out.println("Merhaba aradiginiz icin tesekkur");
        } else if (userOption == 4) {
            System.out.println("Privet,spasiba za vas zvanok");
        } else if (userOption == 5) {
            System.out.println("sMerci pour vatre appel");
        } else if (userOption == 6) {
            System.out.println("salam,zeng etdiyiniz ucun tesekkur");
        } else {
            System.out.println("we will use english by default");
        }
        System.out.println("-----------------------------------------------------------------------------");

        //Option 2 switch

        String message;
        switch (userOption) {

        case 1:
        message = "hello,thankks for your call: ";
        break;
        case 2:
        message = "Hola,gracias para lam";
            break;
        case 3:
        message = "Merhaba aradiginiz icin tesekkur";
            break;
        case 4:
        message = "Privet,spasiba za vas zvanok";
            break;
        case 5:
        message = "sMerci pour vatre appel";
            break;
        case 6:
        message = "salam,zeng etdiyiniz ucun tesekkur";
            break;
        default:
        message = "we will use english by default";

    }
        System.out.println(message);
    }
}