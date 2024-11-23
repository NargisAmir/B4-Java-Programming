package day16_loops;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a URL: ");
        String url = scan.next();//www.google.com
        url = url.substring( url.indexOf(".") +1,url.lastIndexOf(".")  );

        System.out.println(url);
    /*
    TODO: Home practice
          Make sure that URL starts with www.and ends with .com
          if not orint "mu code is not designed to handle your URL"
          If it is -- do what the task says
     */


    }
}
