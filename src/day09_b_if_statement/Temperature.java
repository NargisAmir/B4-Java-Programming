package day09_b_if_statement;

/*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
       Scanner key= new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        int temp = key.nextInt();
         if(temp >= 70){
             System.out.println("it is a nice day");
             System.out.println("go outside but with your laptop ");
         }else{
             System.out.println("Its to cold");
             System.out.println("Code more Java");

         }


    }
}
