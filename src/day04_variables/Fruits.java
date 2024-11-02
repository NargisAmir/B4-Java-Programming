package day04_variables;

public class Fruits {
    public static void main(String[] args) {
        int apples = 60;
       int  grapes= 80;
       int bananas = 100;
        System.out.println("This is how many apples i have: " + 60);
        System.out.println("This is how many apples i have: " + apples);


        System.out.println(grapes);
        System.out.println("Grapes:" + grapes);

        System.out.println("Bananas:" + bananas);
        // i sold 30 apples
        System.out.println("I sold 30 apples");
        apples = 40;//reassign a variable called apples to the new value which is 40
        System.out.println("This is how many apples i have: " + apples);

        double price = 15.99;
        //"" ---- String
        //+ --- concatenation
        //"" -- string

        System.out.println("The discounted price for all the left over apples is $15.99");//hardcoded
        System.out.println("The discounted price for all the left over apples is $ " + price);



    }
}