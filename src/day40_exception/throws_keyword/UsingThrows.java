package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args) {

   //  Thread.sleep(2000);//Compile time exception(checked exception)+may have runtime exception

        /**
         *  with exceptions we have 2 options
         *   1)handle it with --> try catch block
         *   2)do not handle it--> by pass it to someone else
         *   3)
         */

        test1(200);

        // In order to be able to use
        //      I can either handle it with try catch and use
        //      I can Bypass exception in the method declaration and use
        //test2(200);


    }


    public static void test1 (int millis){
        // 1- Handling it with try-catch block
        try{
            Thread.sleep(millis); // when minus value provided -> IllegalArgumentException
        } catch (Exception e){
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }


    public static void test2 (int millis) throws InterruptedException{
        // 2 - Bypass it to anyone that calls this method. / NOT HANDLING IT
        Thread.sleep(millis);
    }

}
