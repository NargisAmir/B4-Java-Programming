package day35_inheritance.book;

public class AudioBook extends Book {

//    String author;
//    int authorAge;
//    String title;
//    String genre;
//    int chapterCount;
//    double price;
//    boolean hasMovie;


    double duration;
    String narrator;

    public void listen(){
        System.out.println("Listening..." +title + " by " + narrator);
    }
}
