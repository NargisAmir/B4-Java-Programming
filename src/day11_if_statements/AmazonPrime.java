package day11_if_statements;

import java.sql.SQLOutput;

public class AmazonPrime {
    public static void main(String[] args) {
        double price =22;
        boolean hasPrimeMemmbership = false;
       //nested
        if (hasPrimeMemmbership){
            System.out.println("Eligible for 2 days shipping");
        }else{
            if(price >= 25){
                System.out.println("Eligible for regular shipping");
            }else{
                System.out.println("Not eligible for free shippinh.shipping is 3.99$ :");
                price +=3.99;
            }
        }

        System.out.println(price );

  //if else if
  if(hasPrimeMemmbership){
      System.out.println("Eligible for 2 days shipping");
  } else if (!hasPrimeMemmbership && price >=25) {
      System.out.println("Eligible for regular shipping");
  }else if(!hasPrimeMemmbership && price < 25){
      System.out.println("Not eligible for free shippinh.shipping is 3.99$ :");
  }

    }
}
