package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        //OPTION1
        Scanner key = new Scanner(System.in);
        System.out.println("Please,enter a number: ");
        int num = key.nextInt();
        if (num % 3 == 0 && num %5 ==0){
           System.out.println("FizzBuzz");
        }else if(num %5 == 0){
           System.out.println("buzz");

        }else if(num % 3 == 0 ){
            System.out.println("Fizz");
        }else {
            System.out.println(num);
       }

      //Option 2
        if(num % 3 ==0 && num %5!=0) {
            System.out.println("Fizz");
        } else if (num % 5==0 && num %3!=0){
            System.out.println("Buzz");
        }else if (num %3 ==0 && num %5 ==0){
            System.out.println("FizzBUzz");
        }else{
            System.out.println(num);
        }
    }
}
