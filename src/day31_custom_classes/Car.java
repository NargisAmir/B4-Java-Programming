package day31_custom_classes;

public class Car {
//Instance variables
  String model;
  int year;
  String color;
  double fuelLevel;





  public void drive(){
      System.out.println("Driving :" + model);
      fuelLevel-=5;
  }

  public void fillTank(){
      System.out.println("filling tank :");
      fuelLevel =100;
  }

  public boolean isFuelLevelLow(){

      return fuelLevel <25;
  }


    public String toString() {
        return "Car : " +
                "\n\tmodel: " + model +
                "\n\tyear: " + year +
                "\n\tcolor: " + color +
                "\n\tfuelLevel: " + fuelLevel;


    }
}
