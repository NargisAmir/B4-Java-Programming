package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,5,6,6,12,54,23,65,3,6));

        //removeAll(object)-we can use this for specific element but if we have some range then might not be good idea

        //1.try removing with traditional loop-with this way once the element is removed everything in the collection SHIFTS to the left ,and cousing missing some elements to be checked

       // for (int i = 0; i < list.size(); i++) {
          //  System.out.println(list.get(i));
        //    if (list.get(i) <= 6) {
          //      list.remove(i);
        //    }
      //  }
     //   System.out.println(list);
        //i=0---> 2,3,5,6,6,12,54,23,65,3,6
        //       3,5,6,6,12,54,23,65,3,6

        //2.try removing with Foreach loop--ConcurrentModificationException-with ForEach  Loop we can NOT change the size while looping
     //   for(Integer eachElement:list){
         //   if(eachElement <= 6){
          //      list.remove(eachElement);
          //  }

      //  }
       // System.out.println(list);
        //1st cycle -EachElement -2,3,5,6,6,12,54,23,65,3,6
        //                         3,5,6,6,12,54,23,65,3,6--new size is less
        //2nd cycle- EachElement -since the size changed forEach loop will give an Runtime Exception


      //3 - Iterator
        Iterator<Integer>it = list.iterator();//I need this line of code to be able to call hasNext(),next(),remove();
        //it = calls [ 2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6]
        while (it.hasNext()) {
           if (it.next() <= 6) {
               it.remove();
           }
        }
       System.out.println(list);

        System.out.println("--------------------");
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2,3,5,6,6,12,54,23,65,3,6));
        System.out.println(list2);
        list2.removeIf(e -> e <= 6);
        System.out.println(list2);
        System.out.println(new TreeSet<>(list2));
    }

        }


