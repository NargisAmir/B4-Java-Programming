package day33_a_static;
//Template class
public class BestBuy {
    //Instance variable-belongs to each object/each has its own copy
    String location;

    //static variable - belongs to all object,one/ samecopy for all
   static  String headquarter ="7691 Penn Ave South,Richield,Minnesota";
   static String specialDay = "28th Dec";

    //Constructor - helps to initialized the instance variables
    public BestBuy(String location) {
        this.location = location;
    }

        //instance method
        public void openStore() {
            System.out.println("Opening store in location: " + location);
        }
        //Static method
    public static void specialDaySale(){
        System.out.println("There is 40%-70% discount on :" + specialDay);
    }

    }
        /**
         * static
         * -ALL objects share/have the ONE/SAME COPY
         * -if it changes/updated,all objects are affected
         * -We use class name to reacch the static members
         *   - Possible to use the object reference as well but not good approach
         *  - Static only accept SATATICS
         *
         * INSTANCE
         *  - Every object has its OWN COPY
         *  -if instance for one object is changed/updated it only affects that object
         *  -We use object reference to each instance members
         *   Not possible to use the class name to reach the instance members
         *   -Instance accepts Both static and instance members
         */
