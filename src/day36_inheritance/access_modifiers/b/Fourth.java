package day36_inheritance.access_modifiers.b;

import day36_inheritance.access_modifiers.a.First;

public class Fourth {
    public static void main(String[] args) {
        First f = new First();
        System.out.println(f.one);
        //  System.out.println(f.two);//protected if there is inheritance if you try to reach the protected variable by parent class object - Not accessible .

        // System.out.println(f.three); default is not accesible outside of the class
        // System.out.println(f.four);
         Fourth f2 = new Fourth();

       // System.out.println(f2.one);
      //  System.out.println(f2.two);
       // System.out.println(f2.three);
      //  System.out.println(f2.four);
        /*
        Since there is no inheritance and non of instance variables inherited to Fourth class from First class
         */

    }
}