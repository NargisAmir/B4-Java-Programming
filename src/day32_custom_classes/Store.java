package day32_custom_classes;
//Runner class
public class Store {
    public static void main(String[] args) {
        Food food0=  new Food("Avacado");
        System.out.println(food0);

        Food food1=  new Food("Apple",5);
        System.out.println(food1);

         Food food2 = new Food("Orange",3,1.99);
        System.out.println(food2);


    }
}
