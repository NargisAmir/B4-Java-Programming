package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        //scanner key; DECLARES SCANNER REFERENCE

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your first name: " );
        String firstName =  key.next();

        System.out.print("Please enter your last name: " );
        String lastName = key.next();
        System.out.print("Are you employed (true/false): " );
       boolean isEmployed = key.nextBoolean();
        System.out.print("are you student (true/false) :" );
        boolean isStudent = key.nextBoolean();



       // System.out.println( firstName + " - " + lastName +  " - " +isEmployed + " - " +isStudent);


        System.out.println();
        System.out.println("information about " + firstName + " " + lastName + "\n\tIs employed :" + isEmployed + "\n\tIs Student :" + isStudent);



    }
}
