package day09_a_scanner;

public class Discount {
    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFireFighter = false;

        boolean isEligibleForDiscount = isWeekend && isTeacher || isOfficer || isFireFighter;
        System.out.println("Is eligible for discount :" + isEligibleForDiscount);

    }
}
