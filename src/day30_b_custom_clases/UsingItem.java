package day30_b_custom_clases;
//Runner class
public class UsingItem {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Orange";

        item1.price=2.99;

        System.out.println(item1);

        Item item2 = new Item();
        System.out.println(item2);
        System.out.println(item2.toString());


    }


}
