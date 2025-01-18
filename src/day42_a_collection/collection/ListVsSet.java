package day42_a_collection.collection;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();//LIST INTERFACE-duplicate allowed,null allowed.insertion order is kept
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        System.out.println("========================");

        Set<Integer> set = new HashSet<Integer>();  //LIST INTERFACE-duplicate NOT allowed,null allowed(SET).insertion order is kept
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        //set.add(null);     //since we used HASsET null is allowed,(in treeset null is not allowed)
        System.out.println(set);
     //   System.out.println(set.get(0));    ----set does not work indexes we can not use index
      //  System.out.println(set.get(list.size()-1));   ----set does not work indexes
        // Q: How then, we can get the elements for SET
        // A Loop through SET and get the matching element
        for (Integer each : set) {
            if (each == 4) { // null == 4 -- > Object cannot be compared with ==
                System.out.println(each);
            }
        }
        System.out.println();
        // loop through list and print each element
          for(Integer each : list){
              System.out.println(each);
          }

             System.out.println("========================");
         //Q:can i take one collection and sort it?
        System.out.println(set);
         Set<Integer>sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);

         System.out.println("========================");
         //Q:How can i remove duplicates?
        System.out.println(list);
        Set<Integer> noDupl1 = new HashSet<>(list);  //Does not guarantee the order
        System.out.println(noDupl1);

        list.remove(null);
        Set<Integer>noDupl2 = new TreeSet<>(list); //removed duplicates and sorted
        System.out.println(noDupl2);

        System.out.println(list);
        Set<Integer>noDupl3 = new LinkedHashSet<>(list); //removed duplicates and kept the order same
        System.out.println(noDupl3);

        System.out.println("-------------------------------------");
        //Q: Can you remove duplicates elements from the following array
        // [ 2,4,3,23,76,-3,-5,2,8,4]
        Integer [] arr = {2,4,3,23,76,-3,-5,2,8,4}   ;

        //1.I can do nested loop and add non duplicates into new array
        //2.I can convert array with Arrays.asList()method and assign it into appropriated collection
        //3.I can use Collections.sort(); just to sort(not remove duplicates)

        System.out.println(Arrays.toString(arr));
        System.out.println(new LinkedHashSet<>(Arrays.asList(arr)));   //remove duplicates and keep same order
        System.out.println(new TreeSet<>(Arrays.asList(arr))); //remove duplicates and sorted    the order

        System.out.println("----------------------------");
        //Q: Can you remove duplicate characters from this string
        //"gfashfgskfglskjdfglskjfasdgsf"

        String str =  "gfashfgskfglskjdfglskjfasdgsf";
        System.out.println(Arrays.toString(str.split( "")));
       System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))));

         // System.out.println( Arrays.toString( str.split("") ) );
         // System.out.println( new LinkedHashSet<>( Arrays.asList(    str.split("")   )  )  );



    }
}
