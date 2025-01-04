package day36_inheritance.final_example;

public class FinalExample {

    //instance variables
  //  final int z;//if something is final it has to have an initial value or through constructor
    final int a = 5;//since it is final and had initial value
    final int b;//since it is final and inital value is given through constructor,this is ok

    //static variables
    //  static final double PI;
    static final String Planet = "Earth";
    static final int Number_of_EarthPlanet;

    public FinalExample(int b) {
        this.b = b;
    }

    static {
        Number_of_EarthPlanet = 1;

    }
}
