package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        System.out.print("\tnumber 1: ");
        int num1 = keyboard.nextInt();
        System.out.print("\tnumber 2 :");
        int num2 = keyboard.nextInt();
        boolean areNumsEqual = num1 == num2;
        System.out.println(num1 + " is equal to " + num2 + ": " + areNumsEqual);
    }
}
