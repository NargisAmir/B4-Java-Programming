package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int y = 5;
        System.out.println(y);
        y = -y;//re-assign ti a new value--new value is the negative version of itself
        System.out.println(y);

        System.out.println("-----------------------------");

        int x = 0;
        System.out.println(x);

        x= x+1;//re-assign a new value
        System.out.println(x);

        System.out.println("-----------------------------");
       //PRE INCREMENT - INCREASING IT BY 1
        ++x;
        System.out.println(x);//x = x+1
        //POST INCREMENT -increasing it by 1
        x++;
        System.out.println(x);// x=x+1
        System.out.println("-----------------------------");
        //sometimes you need to update the variable inside of the action/statement

        System.out.println(++x);//in the print statement abpve i got 2 actions
        //1.is print statement
        //2.is re-assigning
        System.out.println(x);
        System.out.println("-----------------------------");
        System.out.println(x++);
        System.out.println(x);

        System.out.println("---decrement--------");
        --x;
        System.out.println(x);
        x--;
        System.out.println(x);

        System.out.println("--------");
        System.out.println(--x);
        System.out.println(x);
        System.out.println("--------");
        System.out.println(x--);
        System.out.println(x);
    }
}
