package day24_methods;

import java.util.Arrays;

public class AvarageOfForEach {
    public static void main(String[] args) {
int [][] numbers = {
        {3, 4, 5, 6},
        {5, 2, 6},
        {10, 20, 30}
};
double totalSum = 0;
int totalLenght=0;

for (int [] each : numbers){
    double sumEachArr = 0;
    //System.out.println(Arrays.toString(each));

for(int eachELEM :each){
   // System.out.println(eachELEM);
    sumEachArr+= eachELEM;

}
    totalSum+=sumEachArr;
totalLenght += each.length;

    System.out.println("Avarage of "+ Arrays.toString(each) + " is: " + sumEachArr/ each.length);


}
        System.out.println("Avarage of 20 array : " +Arrays.deepToString(numbers)+ " is: " + totalSum/totalLenght );
    }
}
