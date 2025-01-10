package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {

        System.out.println(getDyasOfWeek());
        ArrayList<String> weekDays = getDyasOfWeek();
        System.out.println(weekDays.get(0));
        System.out.println(weekDays.get(weekDays.size() - 1));

        printElements(weekDays);


    }
    public static void printElements(ArrayList<String>list){
        System.out.println("List: " );
        for (String each:list){
            System.out.println("\t" +each);
        }


    }
    public static  ArrayList<String> getDyasOfWeek(){
        ArrayList<String>weekDays= new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"

        ));
       return weekDays;
    }
}
