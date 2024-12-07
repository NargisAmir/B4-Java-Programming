package day24_methods;

import java.sql.SQLOutput;

public class Email {

    public static void main(String[] args) {
        String fullName = "Tom Jerry";
        String domain= "gmail.com";

     // fullName.substring(0,1)+fullName.substring(fullName.indexOf(" ") + 1 )+ "@"+ domain;
     buildEmail(fullName,domain);
     buildEmail("Mickey Mouse", "outlook.com");

    }
    public static void buildEmail(String fullName, String domain){// i declare custome method which accepts 2 parameters

        /*TODO: Make sure that user gives you full name with 2 words
                 and domain contains "@"
                 if does not
                 give message saying reason why
                 HINT:contains

         */
        String result = (fullName.substring(0,1)+fullName.substring(fullName.indexOf(" ") + 1 )+ "@"+ domain).toLowerCase();
      //  fullName.substring(0,1)+fullName.substring(fullName.indexOf(" ") + 1 )+ "@"+ domain;
        System.out.println(result);
    }

}
