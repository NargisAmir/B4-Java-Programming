package day03_comments_escape_sequence;

public class Quotes {
    public static void main(String[] args) {


        System.out.println("Everyone loves Java Programming");
        /*
        Q:How if i want to pront it with double quotes like below
        Everyone loves  "Java" programming
         */
        System.out.println("Everyone loves \"Java\" Programming");
        System.out.println("\"Everyone loves Java Programming\"");

        /*
        Q:Since we use bakward \ slash as part of the syntax then how i print bakward slash\ itself
        There programming language like java\python

        first bakwward slach is for syntax
        second one for the output text to be printed in the console

         */
        System.out.println("There programming language like java\\\\python");

        //forward slash doesnot require any escape sequence
        System.out.println("There programming language like java/python");
    }
}
