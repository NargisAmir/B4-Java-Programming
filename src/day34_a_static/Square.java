package day34_a_static;

public class Square {
   private int side;


    public Square(int side) {
      //  this.side = side;
       setSide(side);
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }
    //instance getter method for side instance variable
    //read the info
    public int getSide(){

        return side;
    }

    public int calculateArea() {
        int result = side * side;
        return result;

    }

    public int calculatePerimeter() {
        return 4 * side;
    }


    public String toString() {
        String message = "";
        message += "Info about the square:" +
                "\n\tSide: " + side + "\n\tArea : " + calculateArea() + "\n\tPerimeter : " + calculatePerimeter();
return message;
    }
    }