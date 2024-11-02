package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char letter1 = 'N';
        char letter2 = 'a';
        char letter3 = 'r';
        char letter4 = 'g';
        char letter5 = 'i';
        char letter6 = 'z';
        System.out.println("Letter1 = " +letter1 );
        System.out.println("letter2 = " +letter2);
        System.out.println("letter3 = " +letter3);
        System.out.println("letter4 = " +letter4);
        System.out.println("letter5 = " +letter5);
        System.out.println("letter6 = " +letter6);

        System.out.println();

        System.out.println(letter1+letter2+letter3+letter4+letter5+letter6);//addition

        System.out.println();

        System.out.println(0+letter2);
        System.out.println(0 +letter3);
        System.out.println(0 +letter4);
        System.out.println(0 +letter5);
        System.out.println(0 +letter6);


        String myName = "" +letter1+letter2+letter3+letter4+letter5+letter6; // concatenation
        System.out.println(myName);

    }
}
