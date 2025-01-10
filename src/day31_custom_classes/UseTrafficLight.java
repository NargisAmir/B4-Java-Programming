package day31_custom_classes;

public class UseTrafficLight {
    public static void main(String[] args) {
     // object reference   =    Actual object
     //                         Constructor
      //  TrafficLight obj1 = new TrafficLight();
      //  System.out.println(obj1);

       // obj1.color="yellow";
       //System.out.println(obj1.color);

//we initialized the instance variable called"color" to be set to "yellow"
        TrafficLight obj2 = new TrafficLight("Yellow");
        System.out.println(obj2.color);

        TrafficLight obj3 = new TrafficLight("Red");
        System.out.println(obj3.color);


    }
}
