package day17_loop;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("hey ,how many numbers do you want to compare: ");
       int countOfNum= key.nextInt();
       int cycle = 1;
       int userNum = 0;
       int biggest = -2147483648;
       int smallest= 2147483647;

      // System.out.println(Integer.MAX_VALUE);
       // System.out.println(Integer.MIN_VALUE);

       while(cycle <= countOfNum) {
           System.out.println("Please enter the number" + cycle + " ;");
           userNum = key.nextInt();

           if (userNum > biggest) {
               biggest = userNum;
           }
           if (userNum < smallest) {
               smallest = userNum;

           }
           cycle++;
       }
        System.out.println(biggest);
        System.out.println(smallest);
    }
}
