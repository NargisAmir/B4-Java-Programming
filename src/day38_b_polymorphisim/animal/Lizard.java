package day38_b_polymorphisim.animal;

public class Lizard extends Raptile {
    String skinColor;

    @Override
    public void eat() {
        System.out.println("Lizard is eating..");;
    }


}
