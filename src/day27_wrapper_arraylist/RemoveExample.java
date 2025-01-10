package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String>arrList = new ArrayList<>();
        System.out.println(arrList.size());//size:0
        System.out.println(arrList);//[]

        arrList.add("java");
        arrList.add("bread");
        arrList.add("water");
        arrList.add("butter");
        System.out.println(arrList);
        arrList.add(0,"banana");
        System.out.println(arrList);

        System.out.println();
        //how can i remove element
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.remove(0);
        System.out.println(arrList);
        System.out.println(arrList.size());

        String removedElem = arrList.remove(1);//this method also returns the element whish was removed
        System.out.println("Removed elem: " + removedElem);
        System.out.println(arrList);
        System.out.println(arrList.size());
        System.out.println();
       arrList.remove(arrList.size()-1);
        System.out.println(arrList);
        System.out.println(arrList.size());


        arrList.add("api");
        arrList.add("sql");
        arrList.add("softskills");
        arrList.add("agile");
        arrList.add("softskills");
        System.out.println(arrList);
        System.out.println();

      boolean isRemoved2 =  arrList.remove("softskills");
        System.out.println(isRemoved2);
        System.out.println(arrList);
    }
}
