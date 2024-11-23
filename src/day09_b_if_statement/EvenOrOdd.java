package day09_b_if_statement;
import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Plese enter a number: ");
        int num = input.nextInt();

       boolean isEven = num % 2 == 0;// even
       boolean isOdd = num % 2 == 1;//odd
        System.out.println(num + "is even: " + isEven);
        System.out.println(num + "is odd: " + isOdd);

     if(isEven) {
         System.out.println(num + "is even");
     }
        if(isOdd) {
            System.out.println(num + "is odd");
        }


    }
}
