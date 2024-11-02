package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        int num1 = 10;
        float num2 = num1;//going from small to big - widening casting-happens automatically(implicitly)
        System.out.println(num1);
        System.out.println(num2);

        float num3 = 3.4F;
        short num4 =(short) num3;//going from Big to Small-narrowing casting-happens manually(expilicitly)
       //short num5 =(int)num3//going from float to int--int is bigger than short
        short num6 =(byte)num3;//going from float to byte --byte is smaller than short so it can hold it-no need explicit casting


        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num6);

        //we can convert to char into int because each character has a number assigned to it from ASCII/UNICODE table
        System.out.println();
        char letter = 'A';
        int letterInNum = letter;//goint from smaller to big dont need  explicit casting
        System.out.println(letter);
        System.out.println(letterInNum);

        String letter2 = "B";
       // int letterInNum2 = letter2; not valid

        System.out.println('C');
        System.out.println((int)'C');
        System.out.println((int)'N');

        int i1 = 150;
        byte b1 = (byte)i1;
        System.out.println(i1);
        System.out.println(b1);

      int i2 = 100;
        byte b2 = (byte)i2;

        System.out.println(i2);
        System.out.println(b2);
    }
}
