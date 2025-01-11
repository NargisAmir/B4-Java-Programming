package day38_b_polymorphisim.animal;

public class Raptile extends Animal {
    int numOfLegs;

    @Override
    public void eat() {
        System.out.println("Reptile is eating..");;
    }
}
