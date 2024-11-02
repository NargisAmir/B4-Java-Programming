package day06_b_unary_operators;

public class IncementExample3 {
    public static void main(String[] args) {
        int i = 5; // assignment
        int z = i++;// increment post
        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a+ 1;
        System.out.println(a);
        System.out.println(b);
        //PRE
        //1.update --a =a+1

        int c = ++a;
        System.out.println(a);
        System.out.println(c);

    }
}
