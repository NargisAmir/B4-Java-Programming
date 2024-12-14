package day27_wrapper_arraylist;

public class ParseNumber {
    public static void main(String[] args) {



  if(Boolean.valueOf("true")){//converting String into Wrapper class object data type
      System.out.println("pass");
  }
        if(Boolean.parseBoolean("true")) {//converting String into Primitive data type
            System.out.println("pass");
        }
        System.out.println("-----------------------------------------------------------------");

        String year = "2024";
        System.out.println("Current year is " +year);
        System.out.println("next year is " +( year +1));//String + 1 is concatenation
   int yearInNum1 = Integer.parseInt(year);
   Integer yearInNum2 = Integer.valueOf(year);
        System.out.println("Next year will be " + (yearInNum1 +1));
        System.out.println("Next year will be "+  (Integer.parseInt(year) + 1));
    }
}
