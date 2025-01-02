package day33_b_encapsulation.access_modifiers.Login;

public class UseLogin {
    public static void main(String[] args) {

        Login user1 = new Login("Loopcamp","hello123");

        //since username and pssword instance variables are private we cannot reach them directly
       //System.out.println(user1.username);
        //System.out.println(user1.password);

        //System.out.println(user1);


        //how can i reach them indirectly?
        System.out.println(user1.getPassword("loop"));
        System.out.println(user1.getPassword("Loopcamp"));

        user1.setPassword("loopcamp", "bye@123");
        System.out.println(user1.getPassword("loopcamp"));

        user1.setPassword("lopcamp", "byeee@123");
        System.out.println(user1.getPassword("loopcamp"));

        user1.setPassword("loopcamp", "byeee@123");
        System.out.println(user1.getPassword("loopcamp"));


        // username INSTANCE variable is private
        // NOT accessible out-site of the class
        // Since there is no public SETTER/GETTER, we dont have indirect access either
        //user1.username = "tom";
        //user1.getUsername();
        //user1.setUsername("");
    }
}
