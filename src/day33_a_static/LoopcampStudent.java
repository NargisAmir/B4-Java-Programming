package day33_a_static;

import java.util.Arrays;

//Template class
public class LoopcampStudent {
    //Instance variables

    String name;
    String groupNumber;
    String mentor;


//static variables
 static int  batchNumber;
 static int courseLengthInMonth;
 static String schoolName;
 static String [] teachers;


 static {
     //System.out.println("Running");
     batchNumber =4;
     courseLengthInMonth =6;
     schoolName="Loopcamp";
     teachers = new String[]{"Feyruz","Nadir"};
     printStaticInfo();
 }
//Constructor - helps initialize instance variables
    public LoopcampStudent(String name, String groupNumber, String mentor) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.mentor = mentor;
    }

    public static void printStaticInfo(){
        System.out.println("School info: ");
        System.out.println("\tSchool name: " + schoolName);
        System.out.println("\tBatch number: " + batchNumber);
        System.out.println("\tCourse length  in month: " + courseLengthInMonth);
        System.out.println("\tTeachers : " + Arrays.toString(teachers));
    }

    @Override
    public String toString() {
        return "LoopcampStudent info: " +
                "\tName: " + name  +
                "\t\tGroup Number: " + groupNumber +
                "\t\tMentor :" + mentor ;

    }
}
