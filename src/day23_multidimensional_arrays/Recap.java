package day23_multidimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int [] arr1 = {30,90,60,360,180};
        int [] arr2 = {180,360,30,60,90};
        String str = Arrays.toString(arr1);
        System.out.println(str);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //how compare 2 arrays
     boolean isequal=  Arrays.equals(arr1,arr2);
        System.out.println(isequal);
        System.out.println("before sorting compare " +Arrays.equals(arr1,arr2) );

        //how do we sort

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("After sorting compare " + Arrays.equals(arr1,arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("==============");
        //how to join elements in ARRAY/How to convert array intp string
        String[] strArr = {"java", "selenium", "jira", "sprint", "release"};
        String strw = String.join("##",strArr);
        System.out.println(strw);


        System.out.println("----------");
        //how to convert string into string array
        String str3 = "Today is Thursday";
       String[] str3Arr = str3.split(" ");
        System.out.println(Arrays.toString(str3Arr));
        System.out.println(str3Arr.length);

        System.out.println("----------");
        //how to convert string into char array
        String str4 = "Loopcamp";
        char [] str4Arr = str4.toCharArray();
        System.out.println(Arrays.toString(str4Arr));
        System.out.println(Arrays.toString(str4.toCharArray()));//char array
        System.out.println(Arrays.toString(str4.split("")));//string array





    }
}
