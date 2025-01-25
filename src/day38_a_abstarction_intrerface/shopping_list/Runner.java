package day38_a_abstarction_intrerface.shopping_list;

public class Runner {
    public static void main(String[] args) {

     //abstract class can not be instantiated /no object
        //interface can not be instantiated/ no object
     Target t = new Target();
     t.buyItem();
     t.returnItem();
        System.out.println(t.price);
        System.out.println("--------");
        Amazon a=new Amazon();
        a.buyItem();
        a.returnItem();
        System.out.println(a.price);
        a.shippingCost(true);
        System.out.println(Amazon.COUNTRY);
        a.deliveryEstimate();
        System.out.println("---------");
        System.out.println(Shipping.COUNTRY);
        System.out.println(Amazon.COUNTRY);
    }
}
