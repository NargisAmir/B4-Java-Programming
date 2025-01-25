package day32_custom_classes;
//Template class
public class Offer {
    //Instance variables
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int pto;

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;

    }
    public Offer(String company, String location,double salary) {
        this.company = company;
        this.location = location;
        this.salary= salary;

    }

    public Offer(String location, String company, double salary, boolean isFullTime, int pto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.pto = pto;
    }

   //instance method doesnot have static keyword
    public String toString() {
        String result = "Offer info:";

        result += "\n\tlocation: " + location;
        result += "\n\tCompany: " + company;
        result += "\n\tSalary: $" + ((salary > 0) ? salary : "Info not avaliable");
        result += "\n\tIsFullTime: " + ((isFullTime ) ? "Full time" : "Part time");
        result += "\n\tPTO: " + ((pto > 0) ? pto : "0 days as PTO or Info not avaliable");

        return result;
    }
}