package day14_string;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "      loopcamp    ";
        System.out.println(str);
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str);

        System.out.println(str.length());

        String str2 = "    java is fun    ";
        System.out.println(str2.length());
        System.out.println(str2.trim());
        System.out.println(str2);
        System.out.println(str2.trim().length());

        System.out.println();
        String str3 = "\tTHursday";
        System.out.println(str3.length());
        System.out.println(str3.trim().length());

    }
}
