package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        AudioBook ab1 = new AudioBook();
        ab1.duration=100;
        ab1.narrator="Morgan Freeman";
        ab1.title ="Java is awesome";
        ab1.listen();

        EBook eb1 = new EBook();
        eb1.size =10;
        eb1.pages=600;
        eb1.title="Selenium";
        eb1.read();

        Book b1 = new Book();


        Author a1 =new Author("Feyruz Jerry",23);

        System.out.println(a1);

     Book b2 = new Book();
        System.out.println(b2.author);
       Author a2= new Author("Nadir softskills",30);
       b2.author=new Author("Nadir softskills",30);
        System.out.println(b2.author);
    }
}
