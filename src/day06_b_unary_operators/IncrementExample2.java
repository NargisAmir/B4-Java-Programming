package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {
        int age = 30;
        System.out.println(age);//30
        System.out.println(age++);////Post increment print 30-update x=x+1
        System.out.println(age);

        System.out.println(age++);//Post increment print 31-update x=x+1
        System.out.println(age++);//Post increment print 32-update x=x+1
        System.out.println(age);
        System.out.println(++age);//pre increment-update x=x+1

        System.out.println(--age);//pre decrement-update x=x-1
        System.out.println(age);
        System.out.println(age--);//POST-DECREMENT use it first then update
        System.out.println(age);

        /*PRE - UPDATE THEN USE
        POST- USE THEN UPDATE

         */
    }
}
