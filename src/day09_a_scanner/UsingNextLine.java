package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("What day is today? ");
        String day = key.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = key.next();
        System.out.println("Enter your last name: ");
        String lastName = key.next();
        key.nextLine();
        System.out.println("Enter your address: ");
        String adress = key.nextLine();
        System.out.println("Enter job titles: ");
        String jobTitles = key.nextLine();
        System.out.println("Please enter couple names:");
        String names = key.nextLine();
        //RULE with NEXTLINE = if there are any other scanner method than nextLine(),right before nextLine()we need handle it with extra nextLine();
        System.out.println("enter your favorite number:");
        int num = key.nextInt();
        key.nextLine();//we handle
        System.out.println("please enter couple words");
        String words = key.nextLine();

    }
}
