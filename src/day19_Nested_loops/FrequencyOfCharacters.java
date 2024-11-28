package day19_Nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
//        String str = "apple";
//        String unique = " ";
//
//        for (int i = 0; i <str.length() ; i++) {
//            int count =0;
//            char outerLetter = str.charAt(i);
//            if(unique.contains(" " + outerLetter)){
//                continue;
//            }
//
//            for (int j = 0; j < str.length(); j++) {
//                char innerLetter = str.charAt(j);  //a - p - p - l - e
//
//                if(outerLetter == innerLetter){
//                    count++;
//                }
//
//            }
//            System.out.println(outerLetter + " - " + count);
//            unique += outerLetter;
//    }
//
//
//

/*

    String: apple

    count how many times each letter is in the String

    a - 1
    p - 2
    l - 1
    e - 1

 */


        String str = "apple";
                //            01234
                String unique = "";  // "ap"

                for (int i = 0; i < str.length(); i++) {
                    int count = 0;
                    char outerLetter = str.charAt(i);                // a

                    if (unique.contains( "" + outerLetter  )){  // "ap".contains("p") -- >
                        continue;
                    }

                    for (int j = 0; j < str.length(); j++) {

                        char innerLetter = str.charAt(j);           // a  - p - p - l - e

                        if (outerLetter == innerLetter) {
                            count++;
                        }

                    }

                    System.out.println(outerLetter + " - " + count);
                    unique += outerLetter;

                }


            }

        }



