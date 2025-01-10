package day31_custom_classes;

public class Coffee {

 double price;
 double sizeInOz;
 String brand;
 String type;


 public void drink(){
  System.out.println("Drinking " + type.toLowerCase() + " type of coffee");

 }

 public void refill(double addOz){
  System.out.println("Refilling " + addOz  + " oz");
 sizeInOz +=addOz;
 }



 public String toString() {
  return "Coffee: " +
          "\n\tprice: $" + price +
          "\n\tsizeInOz:" + sizeInOz +
          "\n\tbrand:" + brand +
          "\n\ttype: " + type;




 }
}
