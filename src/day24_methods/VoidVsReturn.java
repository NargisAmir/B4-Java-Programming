package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {
      sayHi();
        System.out.println("----");
      sayHi2();
        System.out.println(sayHi2());

        String str = sayHi2();
        System.out.println(str);

    }
//this is void method-which means does not return anything
    public static void sayHi() {
        System.out.println("Hi");
    }


//this is return type method-which means it returne something.something can be any data type
    public static String sayHi2() {
        String str = "hi";
        return str;


    }
}