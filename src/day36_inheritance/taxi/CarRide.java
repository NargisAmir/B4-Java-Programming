package day36_inheritance.taxi;

public class CarRide {
    public static void main(String[] args) {
        Lyft L = new Lyft("Feyruz");
        System.out.println(L.calculateRate(10));

        Lyft xl = new Lyft("Tom");
        System.out.println(xl.calculateRate(10));
    }
}
