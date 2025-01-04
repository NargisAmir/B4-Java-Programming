package day36_inheritance.static_hide;

public class B extends A{
      @Override// OVERRIDE THE INSTANCE METHOD IN CHILD CLASS
    public void instanceMethod() {

          System.out.println("An instance method is running from CHILD class");
          staticMethod();
    }


  //@Override STATIC METHODS DONT GET OVERRIDEN-RULE
    //It hides the one from PARENT
    public static void staticMethod() {
        System.out.println("A static method is running from Child class");
    }
}
