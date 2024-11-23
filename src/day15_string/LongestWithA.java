package day15_string;
import java.sql.SQLOutput;
import java.util.*;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter 3 words");
        String word1 = key.next();
        String word2 = key.next();
        String word3 = key.next();

        boolean isFirstLongestWithA = word1.contains("a") && word1.length() > word2.length() && word1.length() > word3.length();
        boolean isSecondLongestWithA = word2.contains("a") && word2.length() > word1.length() && word2.length() > word3.length();
        boolean isThirdLongestWithA = word3.contains("a") && word3.length() > word1.length() && word3.length() > word2.length();

//TODO:Improve the code - implement the option if the words to no have "a" in it.But if there word with "a" then print that one
// HINT: NESTED IF
        if(isFirstLongestWithA){
            System.out.println(word1 + " is the longest with a ");
         } else if (isSecondLongestWithA) {
             System.out.println(word2 + " is the longest with a ");
         }else if (isThirdLongestWithA) {
              System.out.println(word3 + " is the longest with a ");
         }

    }
}