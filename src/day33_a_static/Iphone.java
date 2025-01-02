package day33_a_static;
//Template class
public class Iphone {
    //Instance variables

    String model;
    double price;


  //Static variables
  static String company;
  static String os;
  static String appleDay;

  //Constructor - helps to initialize instance variables
 public Iphone(String model,double price){

     this.model=model;
     this.price=price;
 }

 //Static Block - static initialization
    static{
     System.out.println("Static Block Run");
    company ="Apple";
    os="IOS";
    appleDay = "November 30th";
 }
 //Instance method


    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}'+ "-----" + "Company" + company+
                "OS:" + os + "Apple day : "+ appleDay;

    }
}
