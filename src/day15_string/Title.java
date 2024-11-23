package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your name with titles: ");
        String name = key.nextLine().toLowerCase();

        if(name.startsWith("mr.") || name.startsWith("mister")){
            System.out.println("Hello Sir");
        } else if (name.startsWith("Ms.") || name.startsWith("Miss.") || name.startsWith("Madam")) {
            System.out.println("Hello Ma' am");

        } else if (name.startsWith("Dr.")) {
            System.out.println("Hello doctor");

        } else if (name.endsWith("sr")) {
            System.out.println("Nice to meet you senior");

        }


    }
}
