package day10_if_statements;

public class IfWithoutBracket {
    public static void main(String[] args) {
        if(5<1)//false
            System.out.println("hi");//false
            System.out.println("bye");

        if(5>1)
            System.out.println("hi-1");

        System.out.println("hi-2");

        System.out.println("---------");
        if(4<2)//false
            System.out.println("loop-1");//belonging to if
        else
            System.out.println("loop-2");//this is belonging to else
            System.out.println("loop-3");//this is other statement

    }
}
