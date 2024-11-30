package day21_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};

     //OPITON 1 -just with print statement

        String result = "[";
        for (int i = arr.length-1; i >=0; i--) {
            result+=arr[i] + ", ";
        }

         result = result.substring(0, result.length()-2) + "]";
        System.out.println(result);

// OPTION2 - creat another array an atore all elemts from arr in a reversed order

        int [] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           reversed [reversed.length-1 - i]=arr[i];


        }
        System.out.println("Original " + Arrays.toString(arr));
        System.out.println("Reversed " + Arrays.toString(reversed));

        System.out.println();
        // This will do the same as above with different implementation
        //      initialization ;                condition;            iteration
        int [] reversed2 = new int[arr.length];
        for (int j = 0, i = arr.length - 1;       i >= 0;             i--, j++) {
            reversed2[j] = arr[i];
        }
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Reversed2: " + Arrays.toString(reversed2));

    }
}
