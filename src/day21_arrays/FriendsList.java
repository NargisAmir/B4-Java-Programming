package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter how many firends you have: ");

        String [] friendList = new String[key.nextInt()];

         key.nextLine();//handling enter issue
        for (int i = 0; i < friendList.length; i++) {

            System.out.print("Please enter the name " + (i+1) + " : ");
            friendList[i]= key.nextLine();
        }
        System.out.println(Arrays.toString(friendList));

        System.out.println("I have "+ friendList.length + " friends.My Friend List :" );
        for( String eachName :friendList){
            System.out.println("\t" + eachName);
        }






    }
}
