package day10_if_statements;
//since the scanner class is in a different package to be able to use it,i need import it

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        double salary;
        int hoursPerWeek;
        double hourlyRate;

        System.out.println("Please enter your salary: $");
        salary = keybord.nextDouble();

        System.out.println("How many hoursPerWeek he/she works in a week: ");
        hoursPerWeek = keybord.nextInt();

        hourlyRate = salary/(hoursPerWeek * 52);
        System.out.println("My annual salary is $ "+ salary + " \n\tWork hours per week " +hoursPerWeek +"\n\thourly Rate $ " + hourlyRate);


    }
}
