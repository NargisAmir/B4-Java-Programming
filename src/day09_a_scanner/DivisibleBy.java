package day09_a_scanner;
import java.util.*;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = key.nextInt();
       // System.out.println(num + " ia divisible bu 2: " + (num %2 ==0) );
      // System.out.println(num + " ia divisible bu 3: " + (num %3 ==0) );
       // System.out.println(num + " ia divisible bu 5: " + (num %5 ==0) );
        boolean isDivisibleBy2 = num % 2== 0;
        boolean isDivisibleBy3= num % 2== 0;
        boolean isDivisibleBy5 = num % 2== 0;
        System.out.println(num + " ia divisible bu 2: " + isDivisibleBy2 );
        System.out.println(num + " ia divisible bu 3: " + isDivisibleBy3 );
        System.out.println(num + " ia divisible bu 5: " + isDivisibleBy5 );



    }





}
