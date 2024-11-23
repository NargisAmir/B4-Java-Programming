package day17_loop;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = 777;
        int userGuess;

        do{
            System.out.println("please guess the number");
             userGuess = scan.nextInt();
             if(userGuess < secretNumber){
                 System.out.println("it's too low");
             }else if (userGuess> secretNumber){
                 System.out.println("it's too high");
             }else{
                 System.out.println("Guess correctly");
             }

        }while (userGuess !=secretNumber);


/*
    TODO:in this code implement a logic that tells me after how many tries,i found the correct
           print "After n-th try you guessed it"
 */


    }
}
