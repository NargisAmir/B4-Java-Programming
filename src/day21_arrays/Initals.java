package day21_arrays;

public class Initals {
    public static void main(String[] args) {
        String [] classmates = {" James Bond"," eve Rell", " Anna Johnson"};
        System.out.println("I have " + classmates.length + "full names.");

        //FOR EACH
        for (String eachFullName : classmates){
       eachFullName = eachFullName.trim();
            String firstName = eachFullName.substring(0,eachFullName.indexOf(" ")).toUpperCase();
            String lastName = eachFullName.substring(eachFullName.indexOf(" ") +1).toUpperCase();
            System.out.println("" + firstName.charAt(0) + lastName.charAt(0));
        }
       /*
       TODO:HOMEPRACTICE
             Implement the same code with the use of FORI loop.
        */







    }
}
