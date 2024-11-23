package day17_loop;

public class PrintEachChar {
    public static void main(String[] args) {
        String word = "loopcamp";
        //             01234567
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));
        System.out.println("------------------");

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }

            System.out.println("------------------");
            for (int i=word.length()-1; i >= 0 ; i--) {
                System.out.print(word.charAt(i));
            }  
            
            
            
        }
    }

