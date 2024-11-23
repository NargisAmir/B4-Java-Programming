package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int expectedPinCode = 1111;
        int expectedSSNLast4 = 9876;

        int actualPinCode;
        int actualSSNLast4;

        System.out.println("Welcome to atm \n\tPlease enter your pincode:");
        actualPinCode = key.nextInt();
        System.out.println("\tPlease enter your last 4 digits for SSN:");
        actualSSNLast4 = key.nextInt();

        System.out.println();
        if( actualPinCode == expectedPinCode && actualSSNLast4 == expectedSSNLast4 ){
            System.out.println("Authentication succesful");
        }else {
            System.out.println("Authentication failed");
        }

        if(actualPinCode  != expectedPinCode){
            System.out.println("incorrect pin code");
        }if(actualSSNLast4 != expectedSSNLast4 ){
            System.out.println("invalid ssn");
        }

        /*
        1.POSITIVE SENARIO
          1.valid pincode-valid ssn

        2.NEGATIVE SENARIO
          1.invalid pincode - invalid ssn
          2.valid pincode- invalid ssn
          3.invalid pincode - valid ssn
          4.blank pincode - blank ssn
         */
    }
}
