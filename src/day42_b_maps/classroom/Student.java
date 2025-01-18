package day42_b_maps.classroom;
//Template class-we basically built template how each object of this class will behave

public class Student {
    //instance variables
    String name;
    int age;
    String ID;

    //Custom constructor eliminates the default constructor
    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;


    }

    @Override
    public String toString() {
        return "Student info:" +
                "\tName: " + name  +
                "\tAge: " + age +
                "\tID: " + ID ;
    }
}
