package day34_a_static;

public class UseSquare {
    public static void main(String[] args) {
        Square square1 = new Square(10);
        Square square2 = new Square(20);
        Square square3 = new Square(-40);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);

        System.out.println(square1.getSide());
        System.out.println(square2.getSide());
        System.out.println(square3.getSide());
    }
}
