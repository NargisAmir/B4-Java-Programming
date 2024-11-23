package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isCriminal = false;
        int age = 30;

        boolean isElgible = isCitizen && isCriminal && age > 18;
        //                   true && false && true
        //                      false && true
        //                        false
        System.out.println(name + "is eligible to vote: " + isElgible);

        System.out.println("=====================");
        name = "James Bond ";
        isCitizen = true;
        isCriminal = false;

        age = 18;
        isElgible = isCitizen && !isCriminal && age >= 18;
        System.out.println(name + "is eligible to vote: " + isElgible);

    }
}
