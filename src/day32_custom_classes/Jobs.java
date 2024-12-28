package day32_custom_classes;
//Runner class
public class Jobs {

    public static void main(String[] args) {

  Offer offer1 = new Offer("Apple","California");
        System.out.println(offer1);
        Offer offer2 = new Offer("Tesla","Austin ,Tx",140_000);
        System.out.println(offer2);
        Offer offer3 = new Offer("Savvas","New-York",150_000,true,15);
        System.out.println(offer3);
    }
}
