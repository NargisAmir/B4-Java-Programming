package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200;
        double item1 = 10;
        double item2 = 25.9;


        System.out.println("i have " + giftCard + " balanc in my gift card.");
        System.out.println("I bougt a cup for $" + item1);
        giftCard -=item1;
       System.out.println("After purchasing the cup,I have $" + giftCard + " balance");
       // System.out.println("After purchasing the cup,I have $" + (giftCard -= item1) + " balance");

        System.out.println("I bougt a t shirt for $" + item2);
        System.out.println("After purchasing t shirt,I have $" + (giftCard -= item2) + " balance");


    }
}
