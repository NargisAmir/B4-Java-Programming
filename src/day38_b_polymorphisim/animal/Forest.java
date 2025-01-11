package day38_b_polymorphisim.animal;

public class Forest {
    public static void main(String[] args) {
// 1- ANIMAL
       Animal animal = new Animal();
       animal.eat();
       animal.name = "General animal";
        System.out.println(animal.name);


        //2-Lizard
        //2.a-Reference is itself
        Lizard lizard1 = new Lizard();
        //what lizard1 has access
        lizard1.skinColor = "blue";
        lizard1.eat();
        lizard1.numOfLegs=10;
        lizard1.name="Lizard";
        System.out.println(lizard1.name);
        System.out.println(lizard1.skinColor);
        System.out.println(lizard1.numOfLegs);


        //2.b-Reference is parent
         Raptile lizard2 = new Lizard();
        //what lizard2 has access
       // lizard2.skinColor = "blue";//since reference decides what is accessible skinColor not being in reference class gives an error
        lizard2.eat();//if reptile class and its parent Animal do not have eat() method,then reptile class does not have access to eat() method
        lizard2.numOfLegs=10;
        lizard2.name="Lizard";
        System.out.println(lizard2.name);
        //System.out.println(lizard2.skinColor);//since reference decides what is accessible skinColor not being in reference class gives an error
        System.out.println(lizard2.numOfLegs);

         //2.c-Reference is grandparent
         Animal lizard3 = new Lizard();
        //what lizard3 has access
      //  lizard3.skinColor = "blue";//since reference decides what is accessible skinColor and numofLegs not being in reference class gives an error
        lizard3.eat();
       // lizard3.numOfLegs=10;//since reference decides what is accessible skinColor and numofLegs not being in reference class gives an error
        lizard3.name="Lizard";
        System.out.println(lizard3.name);
       // System.out.println(lizard3.skinColor);//since reference decides what is accessible skinColor and numofLegs not being in reference class gives an error
       // System.out.println(lizard3.numOfLegs);//since reference decides what is accessible skinColor and numofLegs not being in reference class gives an error


         //3.a-Raptile -reference itself
         Raptile raptile1 = new Raptile();
      //  raptile1.skinColor = "blue";//Parent reference & object does not have access anything
        raptile1.eat();
        raptile1.numOfLegs=10;
        raptile1.name="reptile";
        System.out.println(raptile1.name);
       // System.out.println(raptile1.skinColor);
        System.out.println(raptile1.numOfLegs);

         //3.b-Reference is parent
         Animal raptile2 = new Raptile();
        // raptile2.skinColor = "blue";//Parent reference & object does not have access anything
        raptile2.eat();
       // raptile2.numOfLegs=10;//Parent reference & object does not have access anything
        raptile2.name="reptile";
        System.out.println(raptile2.name);
        // System.out.println(raptile2.skinColor);//Parent reference & object does not have access anything
       // System.out.println(raptile2.numOfLegs);//Parent reference & object does not have access anything

    }
}
