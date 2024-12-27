package day31_custom_classes;

public class Marker {


    String type;
    String brand;
    String color;

    @Override
    public String toString() {
        return "Marker: " +
                "\n\tType=" + type +
                "\n\tBrand=" + brand  +
                "\n\tColor=" + color ;
    }

    public Marker(String inputType, String inputBrand, String inputColor){
        type = inputType;
        brand= inputBrand;
        color= inputColor;



    }
}
