package day31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {

     Coffee coffee1 = new Coffee();

     //if we have toString method not declared it will print memory location
        //if we have it declared we can print the objcet and it will call toString bu default
        System.out.println(coffee1);
        //you can do it as well but now needed
       // System.out.println(coffee1.toString());
        //lets assign values to those instance variables

         coffee1.price = 3.99;
         coffee1.sizeInOz = 16.00;
         coffee1.brand="Starbucs";
         coffee1.type="Black";
        System.out.println(coffee1);

        System.out.println();
        System.out.println(coffee1.toString());

        coffee1.drink();
        coffee1.refill(2.0);
        System.out.println(coffee1.sizeInOz);

        System.out.println("----------");
        Coffee  coffee2 = new Coffee();
        System.out.println(coffee2);

      //  coffee2.drink();//NullPointerException

    }


}
