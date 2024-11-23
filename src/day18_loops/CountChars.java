package day18_loops;

public class CountChars {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4&";
        int upperCase = 0;
        int lowerCase = 0;
        int numCount= 0;
        int otherCharCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (eachChar >= 'A' && eachChar <= 'Z') {
            upperCase++;
        } else if (eachChar >= 'a' && eachChar <= 'Z') {
                lowerCase++;
            } else if (eachChar>= '0' && eachChar <= '9') {
                numCount++;
            } else{
               otherCharCount++;
            }
            System.out.println(upperCase + " uppercase letters");
            System.out.println(lowerCase + " lowercase letters");
            System.out.println(numCount + " numbers");
            System.out.println(otherCharCount + " others");
        }
    }
}
