package day24_methods;

import java.util.Arrays;

public class LastCharacter {
    public static void main(String[] args) {
        String [][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };
        System.out.println(Arrays.deepToString(words));

        for(String [] eachSingleArr :words){


        String lastChars = "";

        for( String eachElem : eachSingleArr){
            lastChars+= eachElem.charAt(eachElem.length()-1);

        }
            System.out.println(lastChars);
    }



    }
}
