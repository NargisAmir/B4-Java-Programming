package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "penpen";
        char firstChar = str.charAt(0);

        System.out.println(str.indexOf('p') );
        System.out.println(str.indexOf(firstChar) );

        System.out.println(str.indexOf("p") );

        System.out.println("------");
        //System.out.println(str.indexOf('pe'));
        System.out.println(str.indexOf("pe"));
        System.out.println(str.indexOf("np"));

        System.out.println("------");
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf("e"));
        System.out.println("------");

        System.out.println(str.indexOf("enp"));
        System.out.println(str.indexOf("npe"));
        System.out.println("------");
        System.out.println(str.indexOf('t'));
       // String str = "penpen";
                    //  012345
        System.out.println("------");
        System.out.println(str.indexOf('p',1));

        System.out.println(str.indexOf('e',2));

        System.out.println("------");

        System.out.println(str.indexOf("p",1));

        System.out.println(str.indexOf("e",2));
        System.out.println(str.indexOf("en",2));
        System.out.println(str.indexOf("np",2));
        System.out.println(str.indexOf("np",16));//since index is out of range inside of out of range ,doesnot exist ,so -1

    }
}
