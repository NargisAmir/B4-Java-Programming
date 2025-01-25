package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {
        //outer loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " +i);

            if(i == 3){
                break; //when this break is reached it ends the loop that it is in
            }
             //inner loop

            for (int j = 0; j < 3; j++) {
                System.out.println("j: " +j);
             break;
            }
        }
        System.out.println("===");
        int k = 5;
        for (int i = 0; i < k; i++) {
            break;
        }
    }
}
