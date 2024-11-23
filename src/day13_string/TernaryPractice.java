package day13_string;

public class TernaryPractice {
    public static void main(String[] args) {
        //if the number is less than then and bigger than or equal 0,then print "number is single digit" else print "number is multi digit"
        int num = 45;
        if (num <10 && num >= -9){
            System.out.println("Number is single digit");
        }else{
            System.out.println("Number is multi digit");
        }

//option-2 ternary
        System.out.println((num < 10 && num >=-9)? "Number is single digit" : "number is multi digit");
        System.out.println(num % 2 ==0 ?(num < 10 && num >=-9)? "Number is single digit" : "number is multi digit": "TEST");

    }
}
