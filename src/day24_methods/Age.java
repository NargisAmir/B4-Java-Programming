package day24_methods;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the year you were born: ");
        int userBirthYear = key.nextInt();

        calculateAge(userBirthYear);


    }
    public static void calculateAge(int year){
        // userBirthYear = 1990;
        System.out.println("Your age: " + (2024 - year) );
        // System.out.println("Your age: " + (Year.now().getValue() - year) ); // Year.now().getValue()--- >  utility clas in Java, which returns you the current year.
       }
}