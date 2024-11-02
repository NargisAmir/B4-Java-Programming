package day08_;

public class ShortCircuit {
    public static void main(String[] args) {
        int i = 10;
        //difference between && vs & --- || vs |

        System.out.println(false && ++i > 5);
        //                   true && true ----> true
        System.out.println(i);
        System.out.println();

        int y = 10;
        System.out.println(false & ++y > 5);
        //                   true && true ----> true
        System.out.println(y);

    }
}
