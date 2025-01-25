package day31_custom_classes;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;


public  void CalculateTotalPrice(){
    totalPrice= width* length*unitPrice;
  if(isPersian){
     totalPrice+=200;
  }

}
    public String toString() {
        return "Carpet: " +
                "\n\tWidth:" + width +
                "\n\tLength:" + length +
                "\n\tUnitPrice:" + unitPrice +
                "\n\tTotalPrice:" + totalPrice +
                "\n\tIsPersian:" + isPersian;


    }

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian){

       width=inputWidth;
       length= inputLength;
       unitPrice= inputUnitPrice;
       isPersian=inputIsPersian;
       CalculateTotalPrice();


   }

}






