package day08_;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {
        //Scanner input ;---input is the object reference name(because data type is non primitive/object type

        //int a; --> a is e variable name because data type is Primitive d.t.

        //2# declaring and instantiating scanner object-will help us to get the info from the user/console
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        //int userAge = 30;//HARDCODED value given to userAge
        int userAge = input.nextInt();
        System.out.println("I am " + userAge + " years old");











    }
}
