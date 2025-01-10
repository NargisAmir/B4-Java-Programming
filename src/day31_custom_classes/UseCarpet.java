package day31_custom_classes;

import java.sql.SQLOutput;

public class UseCarpet {
    public static void main(String[] args) {

   Carpet carpet1 = new Carpet(4.5,10.5,99.9,true);

        System.out.println(carpet1);

    //    carpet1.CalculateTotalPrice();
        System.out.println(carpet1);


        System.out.println();
        Carpet carpet2 = new Carpet(10,20,2.5,false);
        System.out.println(carpet2);
    }
}
