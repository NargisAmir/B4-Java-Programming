package day33_b_encapsulation.Bank_accaunt;

public class UseBankAccaunt {
    public static void main(String[] args) {
         BankAccaunt accaunt1= new BankAccaunt();

        accaunt1.setAccauntNumber("662626237328173");
        System.out.println(accaunt1.getAccauntNumber());

        accaunt1.setAccauntNumber("665544332");
        System.out.println(accaunt1.getAccauntNumber());

       accaunt1.setRoutingNumber("12345");
        System.out.println(accaunt1.getAccauntNumber());

        accaunt1.setAccauntNumber("777777222");
        System.out.println(accaunt1.getAccauntNumber());


    }
}
