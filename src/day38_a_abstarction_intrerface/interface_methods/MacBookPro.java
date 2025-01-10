package day38_a_abstarction_intrerface.interface_methods;
//concrete class
public class MacBookPro implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Macbook pro is turned on");

    }
}
class Runner{
    public static void main(String[] args) {

     //Reaching static members with Interface
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);

     //Reaching static members with class
        System.out.println(MacBookPro.NAME);
        System.out.println(MacBookPro.OS);

        //Reaching abstract method with interface name --NOT VALID
        //Mac.turnOn();
        //Reaching overriden method(instance method)with classname -NOT VALID
        //MacBookPro.turnOn();

        MacBookPro mac = new MacBookPro();
       mac.turnOn();


        System.out.println();
        // Reaching static member with interface name - VALID
        Mac.company();
        // Reaching the static member with class name - NOT VALID
        // MacbookPro.company(); // ONLY can be called with its OWN intercase name
        // mac.company(); // ONLY can be called with its OWN intercase name


        System.out.println();
        // Reaching the default method with intercase name - NOT VALID
        // Mac.faceTime(); // non-static canNOT be called by Interface name
        // Reaching the default method with class name - NOT VALID
        // MacbookPro.faceTime(); // non-static canNOT be called by Class name
        mac.faceTime();

    }
}