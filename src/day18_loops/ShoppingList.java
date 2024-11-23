package day18_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        //String userItem = "";
        String shoppingList = "Your Shopping list items: \n";
        String userAnswer = "";
         do{
             System.out.print("Please enter the name of the item: ");
             // userItem= key.nextLine();
             shoppingList =shoppingList+"\n\t"  + key.nextLine();

             System.out.print("do you want to add more item (yes/no) ");
             userAnswer = key.nextLine();

         }while(userAnswer.equalsIgnoreCase("yes"));


        System.out.println(shoppingList);



    }
}
