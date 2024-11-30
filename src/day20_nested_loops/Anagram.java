package day20_nested_loops;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";//str2.replaceFirst("l" ,"");

        if(str1.length() !=str2.length()){
            System.out.println("Not anagram");
        }else{

          //take each char from the first str1
          //remove that matching first char from the second str2
            for (int i = 0; i < str1.length(); i++) {
                char eachChar = str1.charAt(i);
              str2 = str2.replaceFirst(eachChar +"" ,"");  //

            }
            if(str2.isEmpty()){
                System.out.println("it is Anagram");
            }else{
                System.out.println("not anagram");
            }

        }



    }

}
