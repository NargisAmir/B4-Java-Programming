package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(3, 54, 23, 76,  33, 54,7, 8, 9));
        System.out.println("Original " + nums1);

        ArrayList<Integer> nums2 = new ArrayList<>(nums1);//nums2 points to same object as nums 1
        ArrayList<Integer> nums3 = nums1;//nums2 points to a different object whch the copy of nums1


        nums3.removeIf(eachElement-> eachElement %2 ==0);
        System.out.println("Remove if " + nums3);

        nums3.removeIf(each-> each <10);
        System.out.println("Remove if " + nums3);

        //replaceAll()
        nums3.replaceAll((each->each * 2));
        System.out.println("Replace all : "+ nums3);
      // the loop below is doing the same thing as above .replaceAll(); method
        for (int i = 0; i < nums3.size(); i++) {
            nums3.set(i, nums3.get(i)*2);
        }
        System.out.println("For loop :" +nums3);

    }
}
