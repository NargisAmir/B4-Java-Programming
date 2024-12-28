package day32_custom_classes;
//Template
public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;


    public Employee(String name,String jobTitle){
        this.name = name;
        this.jobTitle=jobTitle;

    }
    public Employee(String name,String jobTitle,int id,double salary){
        this.name = name;
        this.jobTitle=jobTitle;
       this.id= id;
       this.salary= salary;
    }
    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
    }

    @Override
    public String toString() {
        return name + " - " + jobTitle + " - " + id + " - $" + salary;
    }
}
