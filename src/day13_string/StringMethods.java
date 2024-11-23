package day13_string;

public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Micky";
        String name2 ="Micky";
        String name3 = new String("Micky");
        System.out.println(name1 ==name2);
        System.out.println(name1 ==name3);
        System.out.println(name2 ==name3);
        System.out.println("============================================");

        //Equals()--- this will compare String value including case sensetive
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name1.equals(name3));

        System.out.println("Micky".equals(name1));
        System.out.println(name1.equals("Micky"));

        System.out.println(new String("Micky").equals(name1));
        System.out.println(name1.equals(new String("Micky")));
        
        System.out.println(new String("micky").equals("Micky"));

    }
}
