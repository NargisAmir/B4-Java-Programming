package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualification {
    public static void main(String[] args) {

        boolean isCitizen;
        boolean isResident;
        boolean hasDiploma;
        int age;

        Scanner key = new Scanner(System.in);
        System.out.print("Welcome to army station");
        System.out.print("Please, answer the following question to check eligibility\n");
        System.out.print("\tAre you citizen(true/false): ");
        isCitizen = key.nextBoolean();
        System.out.print("\tAre you a resident(true/false): ");
        isResident = key.nextBoolean();
        System.out.print("\tDo you have a high school diploma (true/false): ");
        hasDiploma = key.nextBoolean();
        System.out.print("\tHow old are you: ");
        age = key.nextInt();

        if ((isCitizen || isResident) &&hasDiploma && 18 <= age && age <= 35 )
        {  System.out.println("You are eligible");

        }else {

            System.out.println("\n\t You are not eligible for the following reasons");

            if (!isCitizen || !isResident) {

                System.out.println("\t\tYou must be a citizen or resident ");
            } else if (!hasDiploma) {
                System.out.println("\t\tYou must have a high school diploma");
            }
            //if(!(18 <= age && age <= 35)){

            //}
            if(age <18 || age > 35){
                System.out.println("\t\tYour age must be between 18 to 35 years old");
            }

        }

//        System.out.println();
//        System.out.println(isCitizen);
//        System.out.println(isResident);
//        System.out.println(hasDiploma);
//        System.out.println(age);








    }
}
