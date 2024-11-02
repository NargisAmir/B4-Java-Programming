package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName ,lastName,companyName,jobTitle;
        int age,numOfPTO;
        boolean isFullTime,isMarried;
        char gender,suite;
        double salary;

        firstName = "Tom";
        lastName = "Jerry";
        companyName = "Loopcamp";
        jobTitle = "SDET";
        age = 35;
        numOfPTO =21;
        salary = 120_000.00;
        isFullTime= true;
        isMarried = false;
        gender = 'M';
        suite ='A';



        String fullReport= "Full report: \n\tFirst Name:" + "\t\t\t"+ firstName+ "\n\tLast Name: " +"\t\t\t" +lastName +"\n\tCompany name:" +"\t\t" + companyName + "\n\tJob title:" + "\t\t\t"+ jobTitle+ "\n\tAge: " +"\t\t\t\t" +age+"\n\tPto Amount:" + "\t\t\t"+ numOfPTO+ "\n\tSalary: " +"\t\t\t" +salary+"\n\tIs Full time?" + "\t\t"+ isFullTime+ "\n\tIs Married? " +"\t\t" +isMarried +"\n\tGender:" + "\t\t\t\t"+ gender+ "\n\tSuite: " +"\t\t\t\t" +suite;
        System.out.println(fullReport);

        System.out.println("=======");
        System.out.println(fullReport);

    }
}
