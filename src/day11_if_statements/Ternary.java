package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {

        int a = 70;
        String result;
  //OPtION 1 with regular if else statement
        if(a % 2 ==0){
           // System.out.println("Even number"
            result = "Even number";
        }else{
            //System.out.println("odd number");
            result = "Odd number";
        }
        System.out.println(result);

        //OPTION 2 with ternary
        //Condition ? value1 : value2
        //-value 1 -- if condition is TRUE
        // - value 2 --if condition is False
        result = (a % 2 == 0 )? "Even number from Ternary" : "Odd number from Ternary";
        //if you are assigning the result of ternary into a variable,the data type has to match
        System.out.println(result);





    }
}
