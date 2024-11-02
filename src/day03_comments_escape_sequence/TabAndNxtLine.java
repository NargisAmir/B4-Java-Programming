package day03_comments_escape_sequence;

import java.sql.SQLOutput;

public class TabAndNxtLine {
    public static void main(String[] args) {
        //this is explaning the spaces
        System.out.println("A sentence");//has no space at the begining
        System.out.println(" A sentence");//has 1 space at the begining
        System.out.println("  A sentence");//has 2 spaces at the begining
        System.out.println("   A sentence");//has 3 spaces at the begining

        //Now i will use tab to do 4 spaces at one: \t ----4 spaces

        System.out.println("\tA Sentence");
        //lets do 2 tabs
        System.out.println("        A sentence");
        System.out.println("\t\tA Sentence");

        //this is explaning new line
        System.out.println("1) Unlock the car door.");
        System.out.println("2) get into the car.");
        System.out.println("3) Start the car.");

        System.out.println();
        System.out.println("1) Unlock the car door\n2) get into the car\n3) Start the car");

        System.out.println();

        System.out.println("Weekdays:\nMonday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday");

        System.out.println();
        System.out.println("Week Days:\n\tMonday\n\tTuesday\n\tWednesday\n\tThursday\n\tFriday\n\tSaturday\n\tSunday");
    }
}