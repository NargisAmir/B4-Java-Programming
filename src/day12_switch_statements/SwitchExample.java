package day12_switch_statements;

public class SwitchExample {
    public static void main(String[] args) {
        int num = 5;
        switch (num) {
            case 1:
                System.out.println("before arithmeriv operators applied :" + num);
                num *= num;
                System.out.println("after arithmetic operators applied: " + num);
                break;
            case 5:
                System.out.println("Before modules applies: " + num);
                if(num % 2 ==0){
                    System.out.println("even num");
                }else{
                    System.out.println("odd num");
                }
        }

    }
}
