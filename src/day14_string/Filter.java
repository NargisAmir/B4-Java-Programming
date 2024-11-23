package day14_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a message : ");
        String message = key.nextLine();

        message = message.trim();//hey,today is thursday.the class is so easey today .we are bored.java is good.we are dedicated to have fun.
      boolean hasBadPhrase = message.contains(("java is bad")) ||
              message.contains("quit") ||
              message.contains("have fun") ||
              message.contains("crying") ;

         if(hasBadPhrase){
             System.out.println("message failed to send");
         }else{
             System.out.println("\" "+ message + "\" sent!" );

         }



    }
}
