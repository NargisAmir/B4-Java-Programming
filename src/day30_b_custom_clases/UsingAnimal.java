package day30_b_custom_clases;

public class UsingAnimal {
    public static void main(String[] args) {
//    Object reference =   object
        Animal animal1 = new Animal();
        System.out.println(animal1.population);
        System.out.println(animal1.species);
        System.out.println();
        System.out.println(new Animal().population);
        System.out.println(new Animal().species);//this object is not same as the one above
        animal1.species = "Bird";
        animal1.population = 1000000;

        System.out.println(animal1.species);
        System.out.println(animal1.population);
//if tihs method is not declared and you print your object directly it will show memory location
        System.out.println("*********************");
       System.out.println(animal1.toString());
        System.out.println(animal1);


        Animal animal2 = new Animal();
        System.out.println(animal2);


    }



}
