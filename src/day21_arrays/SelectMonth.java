package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number and i will give you month name");
         String []months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
         //                   0     1       2     3     4     5      6      7     8      9     10    11

       int userNum;
       do{
           System.out.println("enter:");
           userNum = key.nextInt();
           if(userNum> 1 && userNum <=12){


           System.out.println("The month for num " + userNum + " is " + months[userNum -1]);
       }else{
               System.out.println("Plese try again");
           }
       }while(userNum <1 || userNum >12);//if usernum is not range of the








    }
}
