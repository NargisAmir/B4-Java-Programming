package day35_inheritance.recap;

public class Pizza {
    private String size;
    private int numOfToppings;


    public Pizza(String size, int numOfToppings) {
        setSize(size);
        setNumOfToppings(numOfToppings);


    }

    //setter for size
    public void setSize(String size) {
        if (size.equalsIgnoreCase("small")
                || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large")) {
            this.size = size;
        }
    }

    //setter for toppigs
    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings > 0) {
            this.numOfToppings = numOfToppings;
        }
    }

    //instance method
    public double calculatePrice() {
        double totalPrice = 0;
        if (size.equalsIgnoreCase("small")) {
            totalPrice = 4;
        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice = 6;

        } else if (size.equalsIgnoreCase("large")) {
            totalPrice = 8;
        }
        totalPrice += numOfToppings * 0.75;

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza info: " +
                "\n\tSize : " + size +
                "\n\tNumOfToppings: " + numOfToppings +
                "\n\tTotalPrice : $ " + calculatePrice();
    }
}