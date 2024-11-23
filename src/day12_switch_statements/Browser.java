package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a browser type: ");
        String browser = key.nextLine();//single words

        System.out.println("What is the webpage you want to negative to: ");
        String webpage = key.next();

        //opening $webpage in $browser
        switch(browser){ //---- string--> string,char,byte,short,int
            case "Chrome":
                System.out.println("Opening " + webpage + " in Chrome browser");
                break;
            case "Safari":
                System.out.println("Opening " + webpage + " in Safari browser");
                break;

            case "Firefox":
                System.out.println("Opening " + webpage + " in Firefox browser");
                break;
            case "Opera":
                System.out.println("Opening " + webpage + " in Opera browser");
                break;
            case "Tor":
                System.out.println("Opening " + webpage + "  in Tor browser");
                break;

            default:
                System.out.println("we dont have " + browser + "insalled in our comp");


        }




    }
}
