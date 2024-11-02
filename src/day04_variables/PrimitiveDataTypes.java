package day04_variables;

import java.sql.SQLOutput;
import java.util.zip.DeflaterOutputStream;

public class PrimitiveDataTypes {
    /*
    Data types:
    1.primitive
    a)Integer type- byte,short,int,long
     b)Floating type -float,double
    c)Single charachters - char
      d)true/false-boolean

    2.Non primitive
     * Sequence of chars - String
     */




    public static void main(String[] args) {
        byte age = 34;
        System.out.println("age");//age is not variable name.its a value itself of string datatype
        System.out.println(age);// age is variable here,datatype is --- byte
        System.out.println(34);//34 is value, and data type is int by default




        short year; // data type is short
        year = 2024; //assign 2024 as value
        System.out.println(year); //year is variable here data type is short
        System.out.println(2024);// 2024 is a value and by default whole num is int

        int ipNumber = 123456;//declared a variable called ipnumber adn datatyle is int
        System.out.println(ipNumber);//ipNumber is a variable and datatyle is int
        System.out.println(123456);//123456 is a value and by default whole number are--int

       long accNumber = 12345678976543789L;
        System.out.println(accNumber);
    }
}
