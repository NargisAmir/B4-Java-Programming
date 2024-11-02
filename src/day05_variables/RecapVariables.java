package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {

        //Declared some variables[LOCAL CARIABLES]

        byte numOfTeaCup;
        double totalPrice;
        int numOfTotalStudents;
        //since we have not given initial values to these variables we cannot uje them
//        System.out.println(numOfTeaCup);
//        System.out.println(totalPrice);
//        System.out.println(numOfTotalStudents);
      //assigning/initializing the variables
        numOfTeaCup = 4;
        totalPrice = 20.0;
         numOfTotalStudents=30;
         //sice we have given/assigned the values now,we can use those variables
        System.out.println(numOfTeaCup);
        System.out.println(totalPrice);
        System.out.println(numOfTotalStudents);

        System.out.println(numOfTeaCup * numOfTotalStudents); //4*30 = INT*int

        System.out.println(numOfTeaCup+ "*" + numOfTotalStudents);//int+string +int

        //declare and assign in one statement together
        double temperature = 67.7;
        int day = 4;
        System.out.println("today is" + 4+ "th day of the week");// hardcoded
        System.out.println("today is" + day+ "th day of the week");//dynamic code

        System.out.println("today the weather was " +temperature + " dergree");//dynamic code

        System.out.println("--------------");
        System.out.println("Test: " +4 +5); //test 45
        System.out.println("Test: " +(4 +5)); //test 9

        int i1;
        int i2;
        int i3;

    }

}
