package day33_a_static;
//runner class
// Import all the static members and reach them without class name
import java.util.Arrays;

import static day33_a_static.LoopcampStudent.*;
public class School {
    public static void main(String[] args) {
   LoopcampStudent student1 = new LoopcampStudent("Nargiz","Group 2","Diana");

        LoopcampStudent student2 = new LoopcampStudent("Roma","Group 1","Iryna");

        System.out.println("---------------------");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println();
        // can you give me all the teachers name
        System.out.println(Arrays.toString(LoopcampStudent.teachers)  );

        System.out.println("---------------------");
        //can you give me all the teachers name
       for(String each : LoopcampStudent.teachers) {
           System.out.println(each);
       }
        System.out.println();
        LoopcampStudent.printStaticInfo();

        System.out.println();
        // Since we did static import, we are able to call the static members without Class name
        printStaticInfo();


    }
}
