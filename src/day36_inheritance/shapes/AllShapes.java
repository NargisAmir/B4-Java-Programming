package day36_inheritance.shapes;

import java.sql.SQLOutput;

public class AllShapes {
    public static void main(String[] args) {

        Square s = new Square(10);
        System.out.println(s.area());
        System.out.println(s.perimeter());
        System.out.println(s);


        Circle c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c);
    }
}
