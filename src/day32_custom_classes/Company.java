package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

    Employee emp1 = new Employee("Tom","Sdet");
        System.out.println(emp1);

        Employee emp2 = new Employee("Nargiz","Sdet",12345,120_000);

        System.out.println(emp2);

        emp1.goToMeeting();
        emp2.goToMeeting();
    }
}
