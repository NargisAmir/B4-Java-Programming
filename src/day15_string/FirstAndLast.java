package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = key.nextLine();//Java is a good coding language


        System.out.println(sentence.charAt(0));
        System.out.println(0 + sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length() -1 ));
        System.out.println(0+  sentence.charAt(sentence.length() -1 ));

        //System.out.println("First char : ");
        //System.out.println("Last char : ");sentence.charAt(sentence.length() -1 )
        System.out.println();
        System.out.println("First char : "+ sentence.charAt(0));
        System.out.println("Last char : " + sentence.charAt(sentence.length() -1 ));
    }
}
