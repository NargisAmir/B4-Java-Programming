package day11_if_statements;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
       // Scanner key = new Scanner();

        int oxygenLevel = 80;

        if (oxygenLevel > 90) {
            System.out.println("Your tank is full");

        } else if (oxygenLevel > 80) {
            System.out.println("Dont go too far");
        } else if (oxygenLevel > 70) {
            System.out.println("start to head back");
        } else if (oxygenLevel > 60) {
            System.out.println("start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you are at 50%");
        }


    }


}



