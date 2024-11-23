package day17_loop;

import java.util.Scanner;

public class MultioplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number that you want to see mult");
        int num = scan.nextInt();

       // int num = 4;
        for (int i = 0; i <=10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i ) );

        }
    }
}
