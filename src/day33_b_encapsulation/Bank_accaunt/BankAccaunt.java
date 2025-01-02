package day33_b_encapsulation.Bank_accaunt;

public class BankAccaunt {
    private String accauntNumber;
    private String routingNumber;


    public String getAccauntNumber() {
        return accauntNumber;
    }

    public void setAccauntNumber(String accauntNumber) {
        if(accauntNumber.length() >=8 && accauntNumber.length()<=12 ){
            this.accauntNumber = accauntNumber;
            System.out.println("Successfully assigned");
        }else{
            System.out.println("not correct digit count");
        }

    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        if (routingNumber.length() == 9) {
            this.routingNumber = routingNumber;
            System.out.println("Successfully assigned");
        }else{
            System.out.println("Not correct digit!");
        }
    }
}
