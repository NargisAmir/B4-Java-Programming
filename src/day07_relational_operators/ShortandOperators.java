package day07_relational_operators;

public class ShortandOperators {
    public static void main(String[] args) {

        int a = 10;//declare and initialized(assigned first value)
        a = 20; // re assign a new value

        a++; //reassign by post increment(increasing value by 1)---> a= a+1;
        ++a;// re assigne by pre increment (increased value by 1)-->a = a+1;
        a= a+1;//re assigned by adding 1;
        System.out.println(a);
        a = a+ 10;// re-assigned by adding 10 in regular way

        a += 10;//re-assigned by shorthand operator(incresing it by 10)--> a= a+10;
        System.out.println(a);
        a = +10;// this not shortand operator
        a =10+ 23;//

        System.out.println();
        int b = 2;
        b *= 3;//b = b*3 ---> b= 2*3
        System.out.println(b);
        int c = 10;
        c%=3;
        System.out.println(c);




    }
}
