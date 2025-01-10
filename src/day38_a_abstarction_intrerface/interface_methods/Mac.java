package day38_a_abstarction_intrerface.interface_methods;

public interface Mac {
    //everyting in interface is "public
    //all the variables are public static final
    //all the method without body public abstract
    //there is no constructor at all (including default)
    //cannot have any blocks - static
    //possible to have default and static method


    //we can have total 4 things in interface
    //1-static variables/Constants
    String NAME = "Apple";
    String OS = "IOS";

    //2-public abstract methods
    void turnOn();


    //3- public static method
    static void company(){
        System.out.println("Company " + NAME);
        System.out.println("Operating System " + OS);

    }

//4-Default method--default is not the access modifier in interface
    default void faceTime(){
        System.out.println("Calling with Facetime");
    }
}
