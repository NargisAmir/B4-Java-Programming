package day38_a_abstarction_intrerface.animal;

import day37_a_abstraction.language.Language;

public  class Parrot  extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Bird is eating");

    }

    @Override
    public void useWings() {
        System.out.println("Bird is using wings");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void sayHello() {
        System.out.println("Bird is saying hello");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Bird is saying goodbye");
    }
}
