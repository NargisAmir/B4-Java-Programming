package day30_b_custom_clases;

public class Animal {

    //Instance variables
    String species;
    long population;



    //Instance method
    //This is special method
    //this method will help us to print objcet directly
//if tihs method is not declared and you print your object directly it will show memory location
   public String toString() {

String message = "Species: " +species + " \npopulation: "+ population;
return message;
   }
}