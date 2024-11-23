package day18_loops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        int count = 0;

        for (int i = 1; i <=num ; i++) {
         if(num% i ==0){
             count++;
         }

        }

       if(count ==2){
           System.out.println(num + " is prime num");
       }else{
           System.out.println(num + " is not prime num");
       }








    }
}
