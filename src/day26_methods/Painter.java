package day26_methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
       // Picture.draw();

      Picture.draw("blue");

      Picture.draw("white","black");
      Picture.draw("pink","yellow","grey");
      Picture.draw(4,"purple");
      Picture.draw("green",5);
      Picture.draw(11);
      Picture.draw(true);
      Picture.draw(77.77);

    }


}
