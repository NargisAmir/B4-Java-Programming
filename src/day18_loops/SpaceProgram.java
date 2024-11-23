package day18_loops;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

      //  String str = "java is cool language";
        Scanner key = new Scanner(System.in);

        String str = key.nextLine().trim().replaceAll(" ","_");
      //  System.out.println("----");
      //  System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
           System.out.print(str.charAt(i));
            if(i == str.length()-1){
                break;
            }

        }







    }
}
