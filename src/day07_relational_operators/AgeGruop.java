package day07_relational_operators;

public class AgeGruop {
    public static void main(String[] args) {
        int ageOfPerson = 65;
        boolean isKid = ageOfPerson <= 13;

        boolean isSenior = ageOfPerson   >= 65;

        System.out.println("the pearson is kid?" + isKid);
        System.out.println("the pearson is Senior: " + isSenior);


    }
}
