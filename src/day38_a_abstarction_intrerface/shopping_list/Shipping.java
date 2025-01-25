package day38_a_abstarction_intrerface.shopping_list;

public interface Shipping {
    //everything is public
    //variables are bu default public static final
    //Constant variable-public static final
    String COUNTRY = "USA";

    void shippingCost(boolean hasMembership);


}
