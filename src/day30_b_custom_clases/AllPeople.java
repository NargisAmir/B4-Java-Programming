package day30_b_custom_clases;

import java.util.ArrayList;
import java.util.Scanner;

//i will use this class as a runner class
public class AllPeople {
    public static void main(String[] args) {
        //this is local variable
        // its inside of method

    String name2 ;
    //cannot use it directly because doesnot have initial value
   // System.out.println(name)
        // System.out.println(age);

        //REFERENCE SIDE        =      OBJECT SIDE
      Scanner key               =      new Scanner(System.in);
        String str               =      new String("Hello");
        ArrayList<String>list    =      new ArrayList<>();
        String[] strArr          =      new String[5];



        //REFERENCE SIDE        =      OBJECT SIDE
        Person person1          =       new Person();
        Person person2          =       new Person();
        Person person3          =       new Person();
        Person person4          =       new Person();
        Person person5          =       new Person();
        Person person6          =       new Person();
        Person person7          =       new Person();


        //how can i access to those instance variables
        //need to create the object to access them
       // System.out.println("Person1 info: " );
        //String str2 = new String("Hello");
       //  System.out.println(str2.charAt(0));
       // System.out.println(str2.substring(2));
        //Integer.parseInt(str2);
       // Integer.valueOf(str2);


        System.out.println("Person1 info: " );
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println( );

        System.out.println("Person2 info: " );
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);

        System.out.println( );

        //Lets give person1 some info
           person1.name ="Tom";
           person1.age = 30;
           person1.height=6.1;
           person1.isMarried= true;

        System.out.println("Person1 info: " );
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);


    }
}
