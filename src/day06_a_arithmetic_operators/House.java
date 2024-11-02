package day06_a_arithmetic_operators;

public class House {
    public static void main(String[] args) {
// we can declare same datatype variables in one statement

        String houseType, address;
        houseType = "Single House";
        address = "123 centre St W,Ontario";
     //   String address;
        // we can declare and initialize same datatype variables in one statement

        int numOfBedroom =5,numOfKitchen = 2, zipCode = 234324;
        //int numOfKitchen;
       // int zipCode;

        double numOfBathroom = 2.5;
        double costOfHouse = 999_999.99;
        double schoolRatings = 4.75;


        boolean hasBasement = true;
        boolean hasAttic = false;
        boolean hasPool= true;
        boolean forSale = true;
        boolean hasNearPark= false;

        /*
        I am looking for houseType which is located in $address $zipcode.It has $numberOfBedrooms and $numOfKitchen as well as $numOfBathroom bathroom.The cost of the house $$costOfHouse.
        The house has the following additional info;
        School Ratings:   $schoolRatings
        Has Basement:     $hasBatement
        Has Attic:        $hasAttic
        Has Pool:         $hasPool
        Is For Sale:     $isForSale
        Has nearby Park:  $hasNearByPark


         */
        String result = "I am looking for \"" +houseType+"\" which is located in"+ address+ " , " + zipCode+ "It has " + numOfBedroom +"bedroom" + numOfKitchen +"kitchen as well as " + numOfBathroom + "bathroom.The cost of the house is $" + costOfHouse + ".\n\nThe house has the following info:\n\tSchool Ratings:\t\t" + schoolRatings + "\n\tHas Basement:\t\t" + hasBasement + "\n\tHas Attic:\t\t\t" +hasAttic+ "\n\tHas Pool:\t\t\t" + hasPool +"\n\tIs For Sale:\t\t" + forSale + "\n\tHas Nearby park:\t" + hasNearPark;

        System.out.println(result);


    }
}
