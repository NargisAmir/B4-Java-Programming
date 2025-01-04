package day36_inheritance.taxi;

public class Lyft {
    //Instance Variable- default -access same package
    String driverName;

    public Lyft(String driverName) {
        this.driverName = driverName;
    }
    //instance method-each mile costs 2.5$
    public double calculateRate(int miles){
        return miles * 2.5;
    }
}
