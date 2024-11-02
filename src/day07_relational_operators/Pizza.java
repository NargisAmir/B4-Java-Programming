package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        String pizzaType = "Pepperoni";
        int numOfSlices = 20;
        int numOfPeople = 3;
       int slicesForEach=  numOfSlices/numOfPeople;
      // int slicesLeft1 = numOfSlices -(numOfPeople* slicesForEach); another way to get correct result
        int slicesLeft = numOfSlices %numOfPeople;
      //  System.out.println(slicesLeft1);
        System.out.println(slicesLeft);
        String result = "We bought " + pizzaType + " pizza .it has " + numOfSlices + " slices .We are " + numOfPeople + " people and each of " + slicesForEach + " slices and there will " + slicesLeft + " slices left over.";
        System.out.println(result);
    }
}
