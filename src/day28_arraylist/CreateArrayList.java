package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("monday");
        l1.add("tuesday");
        System.out.println(l1);

        System.out.println();
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("MON", "TUE"));
        System.out.println(l2);

        ArrayList<String> l3 = l1;
        System.out.println(l3);
        l1.set(0, "1st day");
        System.out.println(l1);
        System.out.println(l3);

        System.out.println();
        ArrayList<String> l4 = new ArrayList<>(l1);//we made a newArraylist copying the l1 Arraylist
        System.out.println(l4);
        l1.set(1,"2nd day");
        System.out.println(l1);
        System.out.println(l4);
    }
}