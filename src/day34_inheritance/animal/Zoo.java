package day34_inheritance.animal;
//runner
public class Zoo {
    public static void main(String[] args)
    {


        dog dog1 = new dog();
        dog1.type="Husky";
        dog1.numOfLegs =4;
        dog1.walk();
        dog1.bark();
        dog1.age = 5;


        cat cat1 = new cat();
        cat1.type="Scottish Fold";
        cat1.numOfLegs =4;
        cat1.walk();
        cat1.meow();
        cat1.age=6;

    Animal animal1 = new Animal();
     animal1.type = "General Animal";
        animal1.numOfLegs =4;
        animal1.walk();
    }
}
