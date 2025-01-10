package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemovedByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(20);
        nums.add(30);
        nums.add(-10);
        nums.add(0);
        System.out.println(nums);
        System.out.println(nums.size());
/*
  .remove()
  .remove() - by index
  .remove() - by object
 */
        /*
        Which element do you want to use?
        "i want to remove emelnt: 3".
         */

        String userAnswer = "i want to remove emelnt: 3";
        String numFromUserAns = userAnswer.substring(userAnswer.lastIndexOf(" ")+1);
        System.out.println(numFromUserAns);

       int i1=  Integer.parseInt(numFromUserAns);
       Integer i2 = Integer.valueOf(numFromUserAns);


        nums.remove(3);
        System.out.println(nums);
        nums.remove((Integer) 3);
       System.out.println(nums);


        //  nums.remove(i1);//since i1 is int it will remove the index
        //nums.remove(i2);//since i1 is integer,, it will remove by object

        nums.remove((Integer)20);
        System.out.println(nums);

        nums.remove(Integer.valueOf("4"));
        System.out.println(nums);
        nums.remove(Integer.parseInt("4"));
        System.out.println(nums);

      //  nums.remove(Integer.parseInt("40"));
      //  System.out.println(nums);
    }
}
