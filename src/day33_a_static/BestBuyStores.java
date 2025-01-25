package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy store1 = new BestBuy("Arlington,VA");
        BestBuy store2 = new BestBuy("Paramus,NJ");
        BestBuy store3 = new BestBuy("Orlando,FL");

        //what is the good way to call the static members
        //Calling static member by object reference is fune but not good
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        //Proper way is to use class name to call
        System.out.println(BestBuy.headquarter);

        //Can i call the instance members by Class name? - NO
        //Because each object has its own copy
       // System.out.println(BestBuy.location);

        BestBuy.headquarter= "980 Test st South,Ruchmond Hill,Ontario";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println("========================");
        store2.headquarter="34 centre street W,Richmond hill,ON";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);
        System.out.println(BestBuy.headquarter);


        System.out.println(store1.specialDay);
        System.out.println(store2.specialDay);
        System.out.println(store3.specialDay);


        System.out.println("==================");

        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("==================");
        BestBuy.specialDaySale();//Good practice

        store1.specialDaySale();//NOT RECOMMENDED
        store2.specialDaySale();//NOT RECOMMENDED
        store3.specialDaySale();//NOT RECOMMENDED


    }
}
