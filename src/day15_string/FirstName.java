package day15_string;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = key.nextLine().trim();
        System.out.print("Please enter your last name: ");
        String lastName = key.nextLine().trim();

        System.out.println("---------------------------------------");
        System.out.println("You full name before corrected :" + firstName + lastName);

        //(" "+ firstName.charAt(0)).toUpperCase();
        String correctFirstName = firstName.substring(0,1).toUpperCase()+  firstName.substring(1).toLowerCase();
        String correctLastName = (" "+ lastName.charAt(0)).toUpperCase()+  lastName.substring(1).toLowerCase();

        System.out.println("---------------------------------------");
        System.out.println("You full name after corrected :" + correctFirstName + correctLastName);




        /*
        TODO:Home practice
        ASK A USER TO GIVE A FULL NAME
        ask a user
        "which of the following option you would like to do?";
        1.make all upper case
        2.make all lower case
        3.make each word capitalized

        your option: 1,2,3
        Then print out what user give you as full name in the option they selected

         */
    }
}
