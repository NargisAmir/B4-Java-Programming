package day17_loop;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int validPin = 7777;
        int userEnterPin;
        int attemptCount = 0;


        System.out.println("Welcome to ATM");
        do{

            System.out.println("Please enter  PIN");
            userEnterPin = scan.nextInt();
            attemptCount++;

        }while(userEnterPin != validPin && attemptCount <3);
        if(attemptCount ==3){
            System.out.println("You are locked out");
        }

    }
}
