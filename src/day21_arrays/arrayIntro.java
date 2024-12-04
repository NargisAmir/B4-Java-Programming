package day21_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class arrayIntro {
    public static void main(String[] args) {
        String str1 ="Denver";

        char letter1 = str1.charAt(0);
        char letter2 = str1.charAt(1);
        char letter3 = str1.charAt(2);
        char letter4 = str1.charAt(3);
        char letter5 = str1.charAt(4);
        char letter6 = str1.charAt(5);

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);
      //  System.out.println(str1.charAt(6));

        System.out.println();

        String str2 = "Chicago Virginia NewYork Boston";
        String city1 = "Chicago";
        String city2 = "Fairfax";
        String city3 = "Newyork";
        String city4 = "Boston";
//     OPTION1 -declare and assign values directly |4 elements are added--> size is 4
        String [] cities1 = {"Chicago","Fairfax","Newyork","Boston"};
       //String [] cities11 = {city1,city2,city3,city4};//instead hard coded values we can use variables as well

        //OPTION2 - declare array with size only.This shows that it has 4 locations
        String [] cities2 = new String[4];


        //how do we access those elements
        System.out.println( cities1[0] );
        System.out.println( cities1[1] );
        System.out.println( cities1[2] );
        System.out.println( cities1[3] );
       // System.out.println( cities1[4] );


        System.out.println();
        System.out.println(  cities2[0]);//WHEN we create an array just with the size but not values added,it shows that location is there by empty
        System.out.println( cities2[0] );
        System.out.println( cities2[1] );
        System.out.println( cities2[2] );
        System.out.println( cities2[3] );
       // System.out.println( cities2[4] );ArrayIndexOutOfBoundsException

        //how can i print all the elements
        System.out.println( cities1 );//we cant print array directly show some memory location /hashcode
        System.out.println(Arrays.toString( cities1));//[Chicago, Fairfax, Newyork, Boston] ARRAYS class is used and it comes from java util package->.toString();

        System.out.println();
        //how can i access to each element in the array

        String arrayToString = Arrays.toString(cities1);//[Chicago, Fairfax, Newyork, Boston]
        System.out.println(arrayToString);

        arrayToString = arrayToString.substring(1,arrayToString.length()-1);//Chicago, Fairfax, Newyork, Boston
        System.out.println(arrayToString);

        arrayToString = arrayToString.replace("," ,"");
        System.out.println(arrayToString);//Chicago Fairfax Newyork Boston

        String [] cities3 = {"Chicago","Fairfax","Newyork","Boston", "Chantilly","Falls Church"};
        System.out.println( cities3.length ) ;



    }

}
