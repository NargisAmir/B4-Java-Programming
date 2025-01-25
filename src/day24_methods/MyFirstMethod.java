package day24_methods;

public class MyFirstMethod {

    public static void main(String[] args) {


        System.out.println("Hello worldd!");

      printHelloWorld();//i called a method named printhello world()
        printHelloWorld();
        printHelloWorld();
        System.out.println("bye");

        printHelloWorld50();
        System.out.println("---------");
        printHelloWorld50();


    }
    //it is public mthod
    //it is static method
    //it is void method(doesnot return anytinh back-does come action)
    //it is non parameterized method
    public static void printHelloWorld(){
        System.out.println("Hello world!");

    }

 public static void printHelloWorld50(){
     for (int i = 0; i < 50; i++) {
         System.out.println("hello world50");

     }
 }


}
