package day35_inheritance.recap;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large",5);
        pizza1.setSize("very big");
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("medium",7);
        System.out.println(pizza2);

            Pizza pizza3 = new Pizza("small",3);
        System.out.println(pizza3);


    }
}
