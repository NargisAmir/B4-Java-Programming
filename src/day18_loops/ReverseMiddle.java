package day18_loops;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = key.nextLine().trim();
        int countSpace = 0;
        for (int i = 0; i < sentence.length(); i++) {
          if(sentence.charAt(i) == ' ')  {
              countSpace++;

          }
        }
        if(countSpace>= 2) {
            int firstSpaceIndex = sentence.indexOf(" ");
            int lastSpaceIndex = sentence.lastIndexOf(" ");
            String middle = sentence.substring(firstSpaceIndex +1,lastSpaceIndex);
            String reverse = "";
            for (int i = middle.length()-1; i >=0; i--) {
                reverse +=middle.charAt(i);
            }
            System.out.println(     sentence.substring(0,firstSpaceIndex)+ " " +reverse + " " +sentence.substring(lastSpaceIndex+1));

        }else{
            System.out.println("sentence has less than 3 words");
        }
        /*
        TODO: Improve this code
              Ask a user to enter a sentence with at least 3 word until user gives it to you.
         */
    }
}
