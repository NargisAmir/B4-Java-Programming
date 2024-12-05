package day22_arrays;

public class MinMax {
    public static void main(String[] args) {

     int [] nums = {500, 1120, -80, 90, 250, -100};
     int max = -2147483647;
     int min = 2147483647;

  for (int eachElem :nums){

    if(eachElem > max) {
        max = eachElem;
    }
      if(eachElem< min){
          min = eachElem;
      }


  }
  System.out.println("Max: " + max);
  System.out.println("Min: " + min);






    }
}
