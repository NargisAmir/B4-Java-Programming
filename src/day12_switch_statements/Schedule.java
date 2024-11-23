package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("What day do you want to know about?");
        String information;

        String day = key.next();
        switch (day){
            case "Monday":
            information ="We have mentor sessions on Mondays" ;
            break;
            case "Tuesday":
            information = "We dont have a class";
            break;
            case "WEdnesday":
            information = "beauriful day.Java classs";
            break;
            case "Thursday":
                information = "beautiful day.Java classs";
                break;
            case "Friday":
            information = "We dont have a class";
            break;
            case "Saturday":
            information = "Beautiful daayyyy.Java class";
            break;
            case "Sunday":
            information = "\"Beautiful beautiful\" Daayyyyy.Java class";
            break;
            default:
                information = "No valid input!";
        }
        System.out.println(information);


    }
}
