package day06_b_unary_operators;

public class Letters {
    public static void main(String[] args) {
        char letter = 'G';
        System.out.println(letter++);//post--use then update
        System.out.println(letter++);//post--use then update
        System.out.println(letter);
        System.out.println(++letter);
        System.out.println(letter);
    }
}
