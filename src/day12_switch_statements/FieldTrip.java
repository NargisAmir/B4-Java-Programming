package day12_switch_statements;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        int grade;
        String teacher;
        String location;
        int numOfGroups;

        Scanner key = new Scanner(System.in);
        System.out.println("what is the grade you want to get a field trip info:");
        grade = key.nextInt();

        if(grade >=1 && grade <= 6){
           // teacher = "Mr.Nadir";
         //   location = "Apple Orchard";
           // numOfGroups = 3;

            if(grade ==1){
                teacher = "Ms.Jessica";
                location = "ZOO";
                numOfGroups = 4;
            }else if(grade ==2) {
                teacher = "Ms.Casey";
                location = "Movie Theatre";
                numOfGroups = 5;
            }else if(grade ==3) {
                teacher = "Ms.Tom";
                location = "Museum";
                numOfGroups = 7;
            }  else if(grade ==4) {
                teacher = "Ms.Jerry";
                location = "Aquarium";
                numOfGroups = 9;
            }else if(grade ==5) {
                teacher = "Ms.Winnie";
                location = "Disneyland";
                numOfGroups = 2;
            }else{
                    teacher = "Ms.Pooh";
                    location = "Concert";
                    numOfGroups = 3;
            }
        }else{
            teacher = "n/a";
            location = "n/a";
            numOfGroups = 0;
        }
        System.out.println("\nHere is field trip info for grade: " + grade);
        System.out.println("\tTeacher name :" + teacher);
        System.out.println("\tLocation :" + teacher);
        System.out.println("\tNumber of groups :" + teacher);








    }
}
