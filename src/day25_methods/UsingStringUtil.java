package day25_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println( StringUtil.fixFormat("jmES"));

        System.out.println(StringUtil.frequencyOfLetters("loopcamp",'o'));
        System.out.println(StringUtil.duplicateCharacters("loopcamp"));
        System.out.println(StringUtil.duplicateCharacters("apple"));
    }

}

