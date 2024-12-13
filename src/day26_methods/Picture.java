package day26_methods;

public class Picture {
     //method is a code of block that does some function/action
    //Custom method
    //this method is public --available anywhere in whole project
    //method is static---this method can be called by class name.
    //method is void---- in terms of what this method is returning it is void method.
    //method is -- non parameterized-- meaning nothing in the parenthesis,no parameters
    public static void draw(){
        System.out.println("Trying to draw");
    }
//!!!!cannot have same name + same()--because when this ,method is called java would not know which method to call
// Method name + () -->METHOD SIGNATURE
   // public static void draw(){
   //     System.out.println("Trying to draw");
   // }

    public static void draw(String color){
        System.out.println("Trying to draw with "+ color + " color.");
    }

    //this has a different method signature
    //this method accepts 2 parameters
    public static void draw(String color1,String color2){
        System.out.println("Trying to draw with "+ color1 + " and " + color2 + " colors.");
    }
    //this has a different method signature
    //this method accepts 3 parameters
    public static void draw(String color1,String color2,String color3){
        System.out.println("Trying to draw with "+ color1 + " and " + color2 + " colors.");
        System.out.println("I also like " + color3 + " color");
    }
    //this has a different Method Signature
    //this method accepts 2 parameters
    public static void draw(int num,String color){
        System.out.println("Trying to draw with "+ num + " different tones of " + color + " color");
    }
    //this has a different Method Signature
    //this method accepts 2 parameters-pay attention to the order to the parameters data types
    public static void draw(String color,int num){
        System.out.println("Trying to draw with "+ num + " different tones of " + color + " color.");
    }
    //this has a different Method Signature
    //this method accepts 1 parameters-pay attention to theo the parameters data types
    public static void draw(int num){
        System.out.println("Trying to draw with "+ num + " brushes.") ;
    }
    //this has a different Method Signature
    //this method accepts 1 parameters-pay attention to  the parameters data types
    public static void draw(boolean isPainted){
        System.out.println("This is already painted: " + isPainted) ;
    }

    //this has a Same Method Signature(Method name+() )
    //this method accepts 1 parameters-pay attention to  the parameters data types
    //Pay attention to the RETURN type
   // public static String draw(boolean isPainted){
     //   System.out.println("This is already painted: " + isPainted) ;
   //     return "";
    //}


    //this has a Different Method Signature(Method name+() )
    //this method accepts 1 parameters-pay attention to  the parameters data types
    //Pay attention to the RETURN type-Still return type doesnot matter for method overloading
     public static String draw(double num){
       System.out.println("This is already painted and sold $ " + num) ;
        return "";
    }
}
