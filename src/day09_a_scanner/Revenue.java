package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
       double  revenue;
        System.out.println("Please enter the price of the item: ");
         double price = input.nextDouble();// taking value from user
        System.out.println("Please enter the quantity of the item: ");
        int quantity = input.nextInt();
        revenue = price * quantity;
        System.out.println("the revenue of the sale us : $" + revenue);

    }
}
