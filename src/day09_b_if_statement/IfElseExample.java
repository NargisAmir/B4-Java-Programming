package day09_b_if_statement;

public class IfElseExample {
    public static void main(String[] args) {
        int point = 75;
        if (point >= 75) {
            System.out.println("you pass the exam");
        }
            if (point < 75) {
                System.out.println("You fail the exam");

                System.out.println("================");
                int score = 75;
                if (score > 75) {
                    System.out.println("great");
                }
                if (score == 75) {
                    System.out.println("good");
                }
                if (score < 75) {
                    System.out.println("bad");
                }
            }
        }
    }