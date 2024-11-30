package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
    int [] nums = {3,4,5};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional loop");

        }
        System.out.println();
        for(int eachElem : nums){
            System.out.println("Foreach loop : " + eachElem);
        }


        System.out.println();
        String [] names = new String[4];
        for (String each : names){
            System.out.println(each);
            each = "Loopcamp";//this will re asiign each variable but will not reassign in array

        }
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length ; i++) {
            names[i] = "Loopcamp";

        }
        System.out.println(Arrays.toString(names));

        System.out.println();
        double [] arr3 = {34, 28, 56, 87};
        for( double each : arr3  ){
            System.out.println(each);
        }

        System.out.println();
        char [] letters = {'l', 'o','o', 'p','c', 'a','m', 'p','b', 'e','s', 't'};
        for (int i = letters.length/2; i < letters.length; i++) {
            System.out.println(letters[i]);

        }
        System.out.println();
        for(char each : letters){
            System.out.println(each);
        }




    }
}
