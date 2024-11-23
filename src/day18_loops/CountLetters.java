package day18_loops;

public class CountLetters {
    public static void main(String[] args) {
        String word = "aabbcaa";
        //             0123456
        char letter = 'a';
        int count = 0;
        /*
        i would loop through the characters/letters from the word and check one by one if it is equal
        if its equal i would count.
         */
        for (int i = 0; i < word.length(); i++) {
           if(word.charAt(i)== letter) {//every char has ascii number assigned ***a==a|a==a|b==a|b==a|c==a|a==a|a==a
               count++;

            }

        }
        System.out.println("In \"" + word + " we have " + count + " \' " + letter +" \'character ");
    }
}
