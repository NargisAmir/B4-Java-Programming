package day38_a_abstarction_intrerface.shopping_list;
//Concrete class
public class Target extends Shopping{
    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from Target");

    }
}
