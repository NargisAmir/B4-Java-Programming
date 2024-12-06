package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultidimArrayExample {
    public static void main(String[] args) {
        int[] n = {5, 10, 20, 10};//single dimensional array
        int[] m = {5, 10, 100, 39, 19};//single dimensional array


        int[][]all2= {{5, 10, 20, 10},{5, 10, 100, 39, 19}};
        int[][]all = {n,m};
        System.out.println(all);//Hashcode--[[I@6acbcfc0 --memory location
        System.out.println(Arrays.toString(all));//[[I@5f184fc6, [I@3feba861]
        System.out.println(Arrays.deepToString(all));//[[5, 10, 20, 10], [5, 10, 100, 39, 19]]

        System.out.println("--------");
        int[][] arr2D = {
                {90, 80, 70},//SINGLE dimensional array 3 elements--index 0
                {60, 50, 40, 30},//SINGLE dimensional array 4 elements--index 1
                {20, 0, -10},//SINGLE dimensional array 3 elements--index 2
                {50}//SINGLE dimensional array 1 element--index 3
        };

        System.out.println(arr2D.length);
        System.out.println(arr2D[0].length);
        System.out.println(arr2D[1].length);
        System.out.println(arr2D[2].length);
        System.out.println(arr2D[3].length);

        System.out.println("----------------");
        System.out.println(arr2D[1][2]);
      //  System.out.println(arr2D[4][1]); ---> ArrayIndexOutOfBoundsException
        System.out.println("----------------");
        System.out.println(Arrays.toString(arr2D[2]));

    }
}
