package day09_b_if_statement;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("What is your balance? $ ");
        double balance ;
        double withdraw;
        balance = key.nextDouble();
        System.out.println("What is your balance? $ ");
       // balance = 10000.00;
        System.out.println("\nyour balance is: $" + balance);

        System.out.println("how much do you wat to withdraw?");
        withdraw = 5000.00;

        System.out.println("you are requesting to withdraw $" + withdraw);
      // balance = balance - withdraw;
       balance -=withdraw;
        System.out.println("Your balance is:$ " +balance);

        System.out.println("how much do you wat to withdraw?");
        withdraw = key.nextDouble();

        if(withdraw > balance){
            System.out.println("not enough money");
        }else{
            balance -=withdraw;
            System.out.println("your new balance is $" + balance);
        }


    }
}
