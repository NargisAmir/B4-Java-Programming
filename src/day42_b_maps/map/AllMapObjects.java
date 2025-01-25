package day42_b_maps.map;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        //TeacherName,ClassName
        HashMap<String, String> map1 = new HashMap<>();//reference itself
        map1.put("Feyruz", "Java");
        map1.put("Nadir", "Selenium");
        map1.put("Diana", "MentorGroup2");
        map1.put("Iryna", "MentorGroup1");
        map1.put(null, "GeneralText");//Null is Ok as Key
        map1.put("test", null);//null is ok as value
        System.out.println(map1);
        //HashMap: Random Order-null as Key is allowed,

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("Feyruz", "Java");
        map2.put("Nadir", "Selenium");
        map2.put("Diana", "MentorGroup2");
        map2.put("Iryna", "MentorGroup1");
        map2.put(null, "GeneralText");//Null is Ok
        map2.put("test", null);//null is ok as a Value
        map2.put("check", null);//null is ok as Value even if is duplicate
        System.out.println(map2);
        //LinkedHashMap<> - INSERTION ORDER,NO DUPLICATE KEY,null is ok as a key and Value


        Map<String, String> map3 = new TreeMap<>();
        map3.put("Feyruz", "Java");
        map3.put("Nadir", "Selenium");
        map3.put("Diana", "MentorGroup2");
        map3.put("Iryna", "MentorGroup1");
      //  map3.put(null, "GeneralText");//Null is NOT Ok as Key
        map3.put("test", null);//null is ok as a Value
        map3.put("check", null);//null is ok as Value even if is duplicate
        System.out.println(map3);

//   TreeMap - Null key is not allowed,Sorted order (ASCII), NULL is not allowed as a Key

        Map<String, String> map4 = new Hashtable<>();
        map4.put("Feyruz", "Java");
        map4.put("Nadir", "Selenium");
        map4.put("Diana", "MentorGroup2");
        map4.put("Iryna", "MentorGroup1");
      //   map4.put(null, "GeneralText");//Null is NOT Ok as Key
      //  map4.put("test", null);//Null is NOT ok as a Value
      //  map4.put("check", null);//null is  not ok as Value even if is duplicate
        System.out.println(map4);

 //   HashTable - Null key and Value are NOT ALLOWED,RANDOM order , DUPLICATE IS NOT ALLOWED




    }
}
