package day18_loops;

public class CharactersInString {
    public static void main(String[] args) {
        String word = "nargiz";
        for (int i = 0; i < word.length(); i++) {
            int asciiNum = word.charAt(i);
            System.out.println(asciiNum);
           // System.out.println(0 + word.charAt(i));
            //System.out.println((int)word.charAt(i));
           // double d = 4.5;
            //int n = (int)d;
        }
    }

}
