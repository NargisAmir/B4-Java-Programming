package day30_b_custom_clases;

public class App {
//INSTANCE variables / Fields ---not method

  String name ;
  double version;
  boolean isFree;


//Build same actions for this class/blueprint
 //INSTANCE METHOD/non-static method
  //each obect will run its own version
  public void run(){

    System.out.println(name + " is running....");

  }
public void update(){

  System.out.println(name + " is updating....");
  version+=1;
}


}
