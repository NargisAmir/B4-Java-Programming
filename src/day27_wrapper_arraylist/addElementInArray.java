package day27_wrapper_arraylist;

import java.util.Arrays;

public class addElementInArray {
    public static void main(String[] args) {
        int[]a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
       int [] b =  addElementArr(a,40);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(addElementArr(b,890)));
        System.out.println(Arrays.toString(addElementArr(b,600)));


        System.out.println("-------------------------");

        int [] c = addElemInArray(a, 3, 4 ,56, 76);
        System.out.println( Arrays.toString( c ) );
        int [] d = addElemInArray(a, 3, 4 ,56, 76, 54, 23);
        System.out.println( Arrays.toString( d ) );



    }
    public static int[] addElementArr(int[] arr,int num){

       int[] addedArr= Arrays.copyOf(arr,arr.length+1);
       addedArr[addedArr.length -1 ]=num;


        return addedArr;
    }
    public static int[] addElemInArray(int[] arr, int... arr2){
        int [] addedAr = Arrays.copyOf(arr,arr.length + arr2.length);

        for (int i = arr.length, j = 0; i < addedAr.length ; i++,j++) {
            addedAr [i] = arr2[j];



        }



        return addedAr;
    }


}
