package day16_loops;

public class SmsParts {
    public static void main(String[] args) {

       String str = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
       String actualSender = str.substring(str.indexOf('<')+1,(str.indexOf('>')));
        String actualNumber = str.substring(str.indexOf('[')+1,(str.indexOf(']')));
        String actualMessage = str.substring(str.indexOf('{')+2,(str.indexOf('}')+0));

        System.out.println("Sender: " + actualSender + "\nNumber: "  + actualNumber + "\nMessage: "+  actualMessage);


    }
}
