package day14_string;

public class EmptyorBlank {
    public static void main(String[] args) {
        String str = "new word";

        System.out.println(str.isEmpty());//it has characters in it.so it is not empty

        str = " ";// reassign
        System.out.println(str.isEmpty());// it has a character
        System.out.println(str.length());
        str = "";
        System.out.println(str.isEmpty());
        System.out.println(str.length());


        System.out.println("===========================");
// str = "" === only case which will be true for both
        System.out.println("is empty :" + str.isEmpty());
        System.out.println("is empty :" + str.isBlank());

        System.out.println("===========================");
        str = "java is fun";
        System.out.println("is empty :" + str.isEmpty());
        System.out.println("is empty :" + str.isBlank());

        System.out.println("===========================");
        str = "       ";//only blank spaces
        System.out.println("is empty :" + str.isEmpty());
        System.out.println("is empty :" + str.isBlank());

        System.out.println("===========================");
        str = " ";//only blank spaces
        System.out.println("is empty :" + str.isEmpty());
        System.out.println("is empty :" + str.isBlank());
    }
}
