package day24_methods;

public class MyMatchClass {
    public static void main(String[] args) {

        addition(12, 34);
        addition(324, 45);

        System.out.println("-----");
        subtraction(366, 37);
        subtraction(666, 66);

        System.out.println("-----");
        multiplication(6, 8);
        multiplication(5, 5);

        System.out.println("-----");
        division(88, 11);
        division(99, 0);
    }

    public static void addition(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void division(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Not divisible by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}