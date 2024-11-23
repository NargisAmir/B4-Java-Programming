package day11_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int expPin = 2222;
        double balance = 1000000.0;

        System.out.println("Welcome to ATM .\n\tPlease enter your pincode.\n\tThen please enter your pincode:");
        int actualPin = key.nextInt();
         if(actualPin == expPin){
             System.out.println("\n\tYou are logged in:");
             System.out.println("\tSelect one of the options");
             System.out.println("\t\t1) - check Balance");
             System.out.println("\t\t2) - Deposit");
             System.out.println("\t\t3) - Withdraw");
             System.out.println("\t\t4) - Cancel");
             System.out.println("\t\tYou choise (1-4)");
             int userchoise = key.nextInt();

             if(userchoise ==1){
                 System.out.println("\t\tYour balance is $" + balance);

             }
             else if(userchoise ==2){
                 System.out.println("\t\tPlease insert the cash...");
                 double depositMoney= key.nextDouble();
                 balance +=depositMoney;
                 System.out.println("\t\tAfter deposit your new balance is $: " + balance);
             }else if(userchoise ==3){
                 System.out.println("\n\t\t Please,enter the amount you want to withdraw ...");
                 double withMon = key.nextDouble();
                 
                 if(balance <0){
                     System.out.println("\t\tinvalid input.Logget out");
                 }
                // balance -=withMon;
                 if(withMon>balance){
                     System.out.println("Not enough money.");
                 }else{
                     balance-=withMon;
                     System.out.println("After deposit your new balance :" + balance);
                 }

             }else if(userchoise==4){

             }else{
                 System.out.println("\t\tinvalid option.Exiting system bu logging you out");
             }

         }else{
             System.out.println("invalid pincode.Go home and try to remmember your pincode");
         }





    }
}
