package day33_a_static;
//Template
public class Song {

    String name;
    double length;
    String singer;
    String genre;

  //CONSTRUCTOR-special method,used to initialize the instance variables
    //1st Constructor-name
    public Song(String name){
       this.name =name;
    }
    //2nd Constructor-name,length
    public Song(String name,double length){
        this.name =name;
        this.length=length;
    }

    public Song(String name, double length, String singer, String genre) {
        this(name,length);
        //this.name = name;
        //this.length = length;
        this.singer = singer;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
