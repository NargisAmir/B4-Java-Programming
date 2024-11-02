package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 3;//3 value is int wince we are assigning int to double and we can do it, why? because double can hold int.So,IMPLICIT CASTING is happening

        double num2 = 2;

        double addition =num1 + num2; // 3.0+2.0
      // double subtraction = num1 - num2;
        int subtraction = (int)num1 - (int)num2;
        int subtraction2 = (int)(num1 - num2);
        System.out.println(subtraction);
        System.out.println(subtraction2);


        double subtraction3 = num1 -num2;
        double multipliaction = num1 * num2;
        double division = num1/num2;//since my data type are double i will be able to see the decimal part of the result as well
        double reminder = num1 %num2;
        System.out.println(num1 + "+"+ num2 + "=" + addition);
        System.out.println(num1 + "-"+ num2 + "=" + subtraction);
        System.out.println(num1 + "*"+ num2 + "=" + multipliaction);
        System.out.println(num1 + "/"+ num2 + "=" + division);
        System.out.println(num1 + "%"+ num2 + "=" + division);


        int i1 =3;
        int i2 =2;
        int div = i1/i2;
        double div2 = i1/i2;
        System.out.println(div);
        System.out.println(div2);


        num1 = 13;
        num2 = 5;
        reminder = num1 % num2;
        System.out.println(num1 +"%" + num2 + "=" + reminder);





    }
}
