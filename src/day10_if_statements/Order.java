package day10_if_statements;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        //object reference = object (parameters)
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter product name");
          key.nextLine();
          String product = key.nextLine();

        System.out.println("Please enter the price $");
        double price = key.nextDouble();

        System.out.println("Please enter the quantity");
        int num = key.nextInt();

        key.nextLine();
        System.out.println("Please enter your full name");
        String fullName = key.nextLine();

        String orderDetails = fullName + " Your order  for " + num + " "+ product + " has been placed.Your total is $totalCost " + (price * num);
        System.out.println(orderDetails);
    }
}
