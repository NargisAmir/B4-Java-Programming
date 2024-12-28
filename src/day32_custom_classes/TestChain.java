package day32_custom_classes;
//Runner class
public class TestChain {
    public static void main(String[] args) {
       ChainExample obj1 =  new ChainExample();
        System.out.println("=====");
        new ChainExample(2);
        System.out.println("=====");
        new ChainExample("Loopcamp");
        System.out.println("=====");
        new ChainExample(5.55);
    }
}
