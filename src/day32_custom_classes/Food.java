package day32_custom_classes;
//Template class
public class Food {
    //Instance Variables
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

//Constructor name
    public Food(String name){
        this.name = name;

    }
    //Constructor name and quantity
    public Food(String name, int quantity){
        this(name);
       // this.name = name;
        this.quantity= quantity;

    }
    //Constructor name ,quantity,unit price
    public Food(String name, int quantity,double unitPrice){
        this(name,quantity);
        //this.name = name;
       // this.quantity= quantity;
        this.unitPrice= unitPrice;
        calculateTotalprice();
    }


    public void calculateTotalprice(){
    totalPrice=quantity *unitPrice;
    }

    @Override
    public String toString() {
        return "Food Info: " + name  + " - > " + quantity +  " x " + unitPrice + " = " + totalPrice;
//        return "Food info:" +
//                "\n\tName:" + name  +
//                "\n\tquantity: " + quantity +
//                "\n\tunitPrice: " + unitPrice +
//                "\n\ttotalPrice: " + totalPrice;
    }
}
