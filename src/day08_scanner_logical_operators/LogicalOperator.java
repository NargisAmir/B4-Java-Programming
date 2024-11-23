package day08_scanner_logical_operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int n = 3;
        //relational operators
        System.out.println(n > 5);//this is a single different statement
        System.out.println(n <20);//this is a single different statement

        //relational and logical operato
        System.out.println(n > 5 && n < 20);//this is single statement using logical and relational operators

        System.out.println("-----------");
        System.out.println(6 > 1 ||   false);


        System.out.println(6< 2 || true );
        System.out.println( 6==6 && 5>6);
        System.out.println(10> 5 || false);
    }
}
