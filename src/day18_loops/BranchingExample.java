package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {
        //break;
        //continue;
        System.out.println("Traditional For loop/For I loop with break or continue");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("=====================");
        System.out.println("Traditional For loop/For I loop with break");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
           System.out.println("=====================");
            System.out.println("Traditional For loop/For I loop with CONTINUNE");
           for (int t = 1; t <= 10; t++) {
                System.out.print(t + " ");
                if (t == 5) {
                    continue;
                }
                    System.out.println("hi");


            }

            System.out.println("=====================");
            for (int j = 0; j < 10; j++) {
                //print only even numbers
                if(j%2 == 1){
                   continue;
                }
                System.out.println(j + "");
            }
        }






    }
}
