package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
         Scanner key = new Scanner(System.in);

        boolean isTriangle,isCircle;

        System.out.println("Enter 3 angles (in Decimals): ");
        double angle1 = key.nextDouble();
        double angle2 = key.nextDouble();
        double angle3 = key.nextDouble();

        double total = angle1 + angle2 + angle3;
        isTriangle = total ==180;
        isCircle = total == 360;

        System.out.println("it is triangle: " + isTriangle);
        System.out.println("it is circle: " + isCircle);

    }
}
