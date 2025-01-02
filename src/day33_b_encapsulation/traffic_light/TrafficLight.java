package day33_b_encapsulation.traffic_light;

public class TrafficLight {
     private  String color ;


   public TrafficLight(String color) {
        this.color = color;
   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
       if(color.equalsIgnoreCase("yellow") ||
          color.equalsIgnoreCase("red") ||
                  color.equalsIgnoreCase("green")){
            this.color = color;
        }else{
            System.out.println("Not valid color in traffic ligth");
        }

    }
}
