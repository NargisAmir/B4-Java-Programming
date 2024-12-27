package day30_b_custom_clases;

public class UsingApp {
    public static void main(String[] args) {


    App application1= new App();


    App application2= new App();

    application1.name = "LoopCamp";
    application1.version = 4.0;
    application1.isFree= true;
    System.out.println(application1.version);


    //App.run();//since.run()is instance method we cannot call it by class name
        application1.run();
        application2.run();


        application2.name = "Excell";
        application2.version = 23.5;
        application2.isFree = false;
        application2.run();


        System.out.println();
        System.out.println(application1.version);
        System.out.println(application2.version);
        System.out.println();

        application1.update();
        System.out.println(application1.version);


        application2.update();
        System.out.println(application2.version);

    }
}
