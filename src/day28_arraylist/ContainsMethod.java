package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        System.out.println(nums.isEmpty());
      boolean result = nums.isEmpty();
        System.out.println(result);

        nums.add(100);
        System.out.println(nums.isEmpty());
        //nums.add(200);
       // nums.add(Integer.parseInt("200"));
        nums.add(Integer.valueOf("600"));
        System.out.println(nums);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(700);
        System.out.println(nums);
        System.out.println(nums.contains(400));
        boolean hasValue = nums.contains(700);
        System.out.println(hasValue);


    }
}
