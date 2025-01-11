package day39_a_polymorphism.book;
//concrete class
public class JavaTextBook  extends EBook {

    //you can have any other members specific to this class
    boolean isFUn;
    @Override
    public void open() {
        System.out.println("Opening Java Text Book");
    }

    @Override
    public void read() {
        System.out.println("Reading Java Text Book");
    }

    @Override
    public void download() {
        System.out.println("Downloading Java Text Book");
    }
}
