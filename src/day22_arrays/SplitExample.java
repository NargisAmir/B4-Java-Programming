package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
         String str = "monday tuesday wednesday thursday friday saturday sunday";
        System.out.println(str.length());

      String[] days = str.split(" ");//[monday, tuesday, wednesday, thursday, friday, saturday, sunday]
        System.out.println(days.length);
        System.out.println(Arrays.toString(days));

        for(String each:days){
            System.out.println(each);
        }
        System.out.println("-----------");
       String []days2 = str.split("day");//[mon,  tues,  wednes,  thurs,  fri,  satur,  sun]
        System.out.println(Arrays.toString(days2));

        for (int i = 0; i < days.length ; i++) {
            days2[i] = days2[i].trim();//we remove spaces from each element from begining and end
        }
        System.out.println(Arrays.toString(days2));

        System.out.println("-----------");
        String []days3 = str.split("day ");//[mon,  tues,  wednes,  thurs,  fri,  satur,  sun]
        System.out.println(Arrays.toString(days3));

        System.out.println("-----------");
        String [] days4 = str.split("");//[m, o, n, d, a, y,  , t, u, e, s, d, a, y,  , w, e, d, n, e, s, d, a, y,  , t, h, u, r, s, d, a, y,  , f, r, i, d, a, y,  , s, a, t, u, r, d, a, y,  , s, u, n, d, a, y]
        System.out.println(Arrays.toString(days4));
        System.out.println("-----------");
        String month = "Jan-Feb-March-Apr-May-June-Apr-July";
        String[] monthArr = month.split("-");
        System.out.println(Arrays.toString(monthArr));

        System.out.println("------Regular case-----");

        String[] monthArr2 = month.split("Apr");
        System.out.println(monthArr2.length);
        System.out.println(Arrays.toString(monthArr2));

        System.out.println("-----------lowercase -----");

        String[] monthArr3 = month.split("apr");
       // String[] monthArr3 = month.toLowerCase().split("apr");//if you want ignore case sensetiviness
        System.out.println(monthArr3.length);
        System.out.println(Arrays.toString(monthArr3));



        System.out.println("-----------");
        String [] month3 = month.split("Dec");
        System.out.println(month3.length);
        System.out.println(Arrays.toString(month3));







    }


}
