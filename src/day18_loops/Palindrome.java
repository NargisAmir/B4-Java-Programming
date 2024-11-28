package day18_loops;

import java.sql.SQLOutput;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Anna";
        String reverse = "";

        /*
        check the original word is same with reversedWord
        1.reverse the word
        get each char from end and put to the beginning
         .charAt()
         */

        for (int i = word.length()-1; i >=0 ; i--) {
            //System.out.print(word.charAt(i));
            reverse += word.charAt(i);//a|a+v|av+a|ava+J
        }
        //compare to words
        //original word vs reverse word
        //word compare
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not polindrome");
        }

        //with turnary
        System.out.println(word.equalsIgnoreCase(reverse)? "it is a palindrome" : "it is not polindrome");

    }
}
