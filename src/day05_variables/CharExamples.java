package day05_variables;

public class CharExamples {
    public static void main(String[] args) {
        //decralring and initialiing
        char letter1 = 'a';
        char letter2 = 'Z';
        char letter3 = '9';
        char letter4 = '%';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);

        System.out.println(letter1 + letter2);//addition -- compiler treats each as number  since each character has a number assign to it in ASCII table
        System.out.println(""+ letter1+ letter2);
// another way to declare char with numbers from ASCII/UNICODE table

        char letter5 = 84;
        System.out.println(letter5);//ascii table 84 is T


        System.out.println(letter1+letter2+letter3+letter4+letter5);
        System.out.println("chars:" + letter1+letter2+letter3+letter4+letter5);

    }
}
