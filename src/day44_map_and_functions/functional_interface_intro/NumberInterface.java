package day44_map_and_functions.functional_interface_intro;


 @FunctionalInterface
public interface NumberInterface {
     void apply(int number);
     //void test;
}
/// Difference between regular Interface and Functional Interface
interface NumInt {
    // public abstract
    void apply (int number);
}

// Concrete class
class A implements NumInt {
    public void apply (int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}


class B implements NumInt {
    public void apply (int num) {
        System.out.println("Cube for " + num + " is " + num * num * num);
    }
}