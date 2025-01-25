package day42_b_maps.classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {

     Student student1 = new Student("Tom",30,"ID#001");
        Student student2 = new Student("Jerry",35,"ID#002");
        Student student3 = new Student("James",20,"ID#003");
        Student student4 = new Student("Jimmy",50,"ID#004");
        System.out.println();

       List<Student> students = new ArrayList<>();
       students.add(student1);
       students.add(student2);
       students.add(student3);
       students.add(student4);
       // System.out.println(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------");
        Map<Integer, List<Student>> studentMap = new HashMap<>();
        studentMap.put(1, students);
        System.out.println(studentMap);
        //KEY IS INTEGER
        //VALUE IS LIST--4 STUDENT OBJECTS
        //1 set of key-value pair(1 ENTRY)

        System.out.println("--------------------------");
        Map<Integer, Student> studentMap2 = new HashMap<>();
        studentMap2.put(1, student1);
        studentMap2.put(2, student2);
        studentMap2.put(3, student3);
        studentMap2.put(4, student4);
        System.out.println(studentMap2);
        //Key is Integer
        //Value is Student object
        //4 set of key-value pair(4 ENTRIES)

        System.out.println("--------------------------");
        studentMap2.put(5,new Student("Casey",30,"ID#005"));
        System.out.println(studentMap2);

        System.out.println("--------------------------");
        System.out.println("we have cuurrently " + studentMap2.size() + " students");




    }
}
