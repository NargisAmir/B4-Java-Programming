package day07_relational_operators;

public class OperatorPractice1 {
    public static void main(String[] args) {

        int b = 12;
        b++;//Post increment b = b+1
        System.out.println(b);
        ++b;//PRE INCREMENT B = B+1
        System.out.println(b);
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);


        System.out.println(b++);//post increment
        //2 actions
        //print---- b = 12
        //update ---b= 13
        System.out.println(b);

        System.out.println(++b);//pre increment
        //2 actions
        //update  ---- b = 14
        //print  ---- b=14

        System.out.println(b);

        System.out.println(--b);//pre decrement
        //2 actions
        //update  ---- b = 13
        //print ---- b=13

        --b;//b = b-1------b = 12;
        System.out.println(--b);//pre decr
        //2 actions
        //update  ---- b = 11
        //print ---- b=11

        System.out.println(b--);//post decrement
        //2 actions
        //print
        //update
        b--;
        System.out.println(b);




    }
}
