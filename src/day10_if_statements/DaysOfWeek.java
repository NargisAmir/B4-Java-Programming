package day10_if_statements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number between 1 -7 inclusive");

        int weekDayInNum = key.nextInt();

        if (weekDayInNum == 1) {
            System.out.println("Monday!");
        }
         else if (weekDayInNum == 2) {
            System.out.println("Tuesday!");
        }
               else  if (weekDayInNum == 3) {
                    System.out.println("Wednesday!");
                }

               else if (weekDayInNum == 4) {
                    System.out.println("Thursday!");
                }
               else if (weekDayInNum == 5) {
                    System.out.println("Friday!");

                }
               else if (weekDayInNum == 6) {
                    System.out.println("Saturday!");
                }
               else if (weekDayInNum == 7) {
                    System.out.println("Sunday Funday!");
                }
            }
        }

