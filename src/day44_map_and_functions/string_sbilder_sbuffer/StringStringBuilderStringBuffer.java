package day44_map_and_functions.string_sbilder_sbuffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {

   //1.String
        //Strings are immutable
   String str1 ="loopcamp";                       //stored it in String pool in heap
   String str2 = new String("loopcamp");  //Stored it in directly Heap
   str1 = str1 + str2;                           //this line created completely a new object in Heap
        System.out.println("String 1: " + str1);
//2.StringBuilder
        System.out.println("============================");
       StringBuilder stringBuilder1 = new StringBuilder("loopcamp");//stored it in directly HEAP
        System.out.println("StringBuilder 1: " + stringBuilder1);
        stringBuilder1.append("loopcamp");
        System.out.println("StringBuilder 1: " + stringBuilder1);//this line does not create a new objet it updates

        System.out.println("================================");
        //3.StringBuffer
        //StringBuffer is Mutable - can only be created by 'new' keyword is synchronized-thread safe
        StringBuffer stringBuffer = new StringBuffer("loopcamp");
        System.out.println("StringBuffer 1: " + stringBuffer);
        //StringBUffer StringBUffer2 = "loopcamp'
        stringBuffer.reverse();
        System.out.println("StringBuffer 1: " + stringBuffer);







    }
}
