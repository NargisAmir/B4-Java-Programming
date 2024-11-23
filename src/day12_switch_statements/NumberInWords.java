package day12_switch_statements;

public class NumberInWords {
    public static void main(String[] args) {
        int num = 5;
        if(num>=1 && num <= 5){
            if(num ==1){
                System.out.println("ONE");
            }
            else if(num ==2){
                System.out.println("TWO");
            }
            else if(num ==3){
                System.out.println("THREE");
            }
            else if(num ==4){
                System.out.println("FOUR");
            }else{
                System.out.println("FIVE");
            }

        }else{
            System.out.println("it is not in the range of 1-5");
        }
    }
}
