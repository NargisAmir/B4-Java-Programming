package day19_Nested_loops;

public class Month {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.println("week " + i);

            for (int j = 1; j <= 7; j++) {
                System.out.println("\tDay " + j);

                for (int k = 1; k <=24; k++) {
                    System.out.println("\t\tHour " + k);
                }

            }


        }
        }
    }