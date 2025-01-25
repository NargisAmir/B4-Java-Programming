package day32_custom_classes;
//Template class
public class ChainExample {

    //1st constructor - non param const
    public ChainExample(){
        System.out.println("First");
    }
//2nd constructor - param const
public ChainExample(int a){
        this();
    System.out.println("Second");
}
//3rd constructor - Parameterized const
    public ChainExample(String str){
        this(4);
        System.out.println("Third");
    }
    //4th constructor - Parameterized const(double)
    public ChainExample(double d){
        this();
        System.out.println("Fourth");
    }
}
/**
RULES for Constructor Chaining
 1 - this() should always be the First Line
 2 - Only ONE constructor can be called in the SAME constructor
 3 - Constructor should not call itself
 4 - Constructor should not contain in the chaining with multiple constructors
 5 - Constructor that is called can not call the one which called it
 */