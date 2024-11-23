package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String expectedUsername = "java@gmail.com";
        String expectedPassword = "loopcamp";

        System.out.println("Please enter your username : ");
        String inputUsername = key.next().toLowerCase();

        System.out.println("Please enter your password :");
        String inputPassword = key.next();

       boolean isValid  = inputUsername.equalsIgnoreCase(expectedUsername) && inputPassword.equals(expectedPassword);
        if(isValid){
                   System.out.println("LOGGED IN");
               }else{
            System.out.println("you have entered either invalid username or password");
        }







    }
}
