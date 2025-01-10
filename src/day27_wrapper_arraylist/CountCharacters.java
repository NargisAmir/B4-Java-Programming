package day27_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {

        String str = "a23hgakf&8Asl98#JH";
        int upperCase = 0;
        int lowerCase = 0;
        int numCount= 0;
        int otherCharCount = 0;

  for (char eachChar:str.toCharArray()) {

      // if(eachChar >= 'A' && eachChar <= 'Z') {
      //   upperCase++;
      //}
      if (Character.isUpperCase(eachChar)) {
          upperCase++;
      } else if (Character.isLowerCase(eachChar)) {
          lowerCase++;
      } else if (Character.isDigit(eachChar)) {
          numCount++;
      } else {
          otherCharCount++;
      }
  }
      System.out.println(upperCase + " uppercase letters");
      System.out.println(lowerCase + " lowercase letters");
      System.out.println(numCount + " numbers");
      System.out.println(otherCharCount + " others");



    }
}
