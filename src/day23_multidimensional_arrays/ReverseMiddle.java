package day23_multidimensional_arrays;

public class ReverseMiddle {
    public static void main(String[] args) {

        String sentence = "java always fun!";
        String[] arr= sentence.split(" ");
        String middle = arr[1];//always
        String midReversed = "";
        char[] letters = middle.toCharArray();

        for (int i = letters.length-1; i >=0 ; i--) {
            midReversed +=letters[i];

        }
        System.out.println(midReversed);
        System.out.println(arr[0] + " " + midReversed + " " + arr[2]);





    }
}
