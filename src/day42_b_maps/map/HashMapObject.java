package day42_b_maps.map;

import day35_inheritance.super_paranthesis.C;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

     //MAP-it works with Key and Value pair -->aka(as known as) Entry

        List<String> list= new ArrayList<>();
        //HashMap<keyDataType,valueDataType> name of object = new HashMap<>();
        HashMap <Integer,        String   >         map     =new HashMap<>();
        //map.add() - in Map WE have put(KEY,VALUE)

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(0, "Zero");
        map.put(-1, "MinusOne");
        map.put(20,"Two");//duplicates value is allowed
        map.put(null, null);//null as Key and null as Value are allowed in Hashmap
        map.put(Integer.parseInt("10"),"Ten");//Since Key is integer data type so we converted 10 String into Integer 10
        System.out.println(map );


        map.put(1,"ONE");//In Map the Key Side does not allow duplicate-so when you add an existing Key map will updaste the value to the new one that is link
        System.out.println(map );

        map.put(1,"THIS IS ONE");
        System.out.println(map );
        //HashMap -order is not guaranteed.Random Order (No insertion order,No sorted Order)
        //HashMap  -No indexes

        System.out.println("------------------------------------");
        //How do I get the elements?
        System.out.println(map.get(2));//2 in here is not the index it is the key-it will return the Value assigned the Integer 2
        System.out.println(map.get(5));//5 in there is not the index it is the key-since it does not exist it will return null meaning nothing here
        String str = map.get(3);//3-in there is not the index it is the key-it will return the Value Three which is assigned linked to Integer 3
        System.out.println(str);

        System.out.println("------------------------------------");
        //How to remove Key/Value
        map.remove(1);
        System.out.println(map);
        System.out.println(map.remove(11));
        System.out.println(map.remove(0));//In here we removed the Key which 0 and Linked value"Zero"-since this  method returned what was removed,I printed it
        System.out.println(map);

        System.out.println("------------------------------------");
        //How to check if the specific Key exist among all the Keys
        System.out.println(map.containsKey(11));//All the avaliable KEYS{-1=MinusOne, 2=Two, 3=Three, 4=Four, 10=Ten}
        System.out.println(map.containsKey(-1));
        //How to check is the specific Value exist among all the Values
        System.out.println(map.containsValue(map.containsValue("One")));//All the avaliable Values{MinusOne,Two,Three,Four,Ten
        System.out.println(map.containsValue(map.containsValue("MinusOne")));
        System.out.println(map.get(-1).contains("One"));//true-map.get(-1)--->"MinusOne" contains "One"
        System.out.println(map.get(-1).toLowerCase().contains("one"));
        System.out.println(map);

        System.out.println("========================================");
        map.put(null,"NewValue");
        System.out.println(map);
        map.put(30,null);
        System.out.println(map);
        map.put(40,null);//Duplicate value are allowed
        System.out.println(map);

        System.out.println("----------------------------------");
        Map<String, String> CartoonCharacters =new HashMap<>();
        CartoonCharacters.put("Tom","Jerry");
        CartoonCharacters.put("Winnie","Pooh");

        Map<String, String> MovieStars =new HashMap<>();
        MovieStars.put("James","Bond");
        MovieStars.put("Winnie","Pooh");

        Map<String, Map<String,String>> infoForEachGroup =new HashMap<>();
        infoForEachGroup.put("CartoonCharacters",CartoonCharacters);
        infoForEachGroup.put("MoviesStarts", MovieStars);

        System.out.println(CartoonCharacters);
        System.out.println(MovieStars);
        System.out.println(infoForEachGroup);

      Map<String,String> infoForCharacterGroup=  infoForEachGroup.get("CartoonCharacters");
        System.out.println(infoForCharacterGroup);

        //Can you get me the last name that is associated with James from  infoForEachGroup map

        infoForEachGroup.get("MoviesStarts");// {Sherlock=Holmes, James=Bond}
        System.out.println(infoForEachGroup.get("MoviesStarts").get("James"));//BOND




    }
}
