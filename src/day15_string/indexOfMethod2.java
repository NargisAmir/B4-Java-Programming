package day15_string;

public class indexOfMethod2 {
    public static void main(String[] args) {
        String str = "javaxa";
        //            0123

        System.out.println(str.indexOf("a") );
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf('a'));

        System.out.println("==================");
        String str2 = "cacaccacbcaccb";
        //             012345678910

        System.out.println(str2.indexOf("ac"));
        System.out.println(str2.lastIndexOf("ac"));

        System.out.println(str2.indexOf("ac",3));
        System.out.println(str2.lastIndexOf("ac",5));

    }
}
