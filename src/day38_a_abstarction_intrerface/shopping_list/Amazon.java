package day38_a_abstarction_intrerface.shopping_list;

public class Amazon extends OnlineShopping implements Shipping{

    @Override
    public void deliveryEstimate() {
        System.out.println("Amazon Delivery");
    }

    @Override
    public void buyItem() {
        System.out.println("Buy an Amazon Item");
    }

    @Override
    public void returnItem() {
        System.out.println("Return an Amazon Item");
    }

    @Override
    public void shippingCost(boolean hasMembership) {
        System.out.println(hasMembership? "has membership no shipping cost" : "has no membership,shipping cost will be added");
    }
}
