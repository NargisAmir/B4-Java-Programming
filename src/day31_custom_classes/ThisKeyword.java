package day31_custom_classes;
//Template class-
public class ThisKeyword {
//INSTANCE VARIABLE = DECLARED AT CLASS LEVEL
  int a;


 //                 LOCAL VARIABLE-DECLARED AT MAX METHOD LEVEL
  public ThisKeyword(int a){
 //Java prioritizes Local variables over the instance variables.if they have same names
      //ok but how to make the difference between them for java?
      //with help of "this" keyword
      //this-->keyword is representation of object reference
  this.a = a;
  }



}
