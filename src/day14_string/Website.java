package day14_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("please enter a website: ");
        String websiteUrl = key.next().toLowerCase();//www.google.com

        boolean isValidBegining = websiteUrl.startsWith("www");
      //  websiteUrl.equalsIgnoreCase("www");
      //  System.out.println(isValidBegining);

        boolean isValidEnd = websiteUrl.endsWith(".com");







    }
}
