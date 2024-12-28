package day32_custom_classes;
//runner class
public class UsePhone {
    public static void main(String[] args) {

    //Phone phone1 = new Phone();
//all instance members should be clled by object reference

    //instead of giving initial values like below we can use instructor
//    phone1.name = "Iphone 16 Pro";
//    phone1.brand = "Apple";
//    phone1.memory = 128;
//    phone1.version = 18.2;


        Phone phone1 = new Phone("Iphone 16 Pro","Apple",128,18.2);

        System.out.println(phone1);

        Phone phone2 = new Phone("Iphone 12 Mini");
        System.out.println(phone2);


        Phone phone3 = new Phone("Iphone 16 pro max","Apple",256);
        System.out.println(phone3);

        Phone phone4 = new Phone("Iphone 15 pro","Apple",512,16.2);
        System.out.println(phone4);
    }
}
