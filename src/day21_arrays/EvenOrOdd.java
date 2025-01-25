package day21_arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int [] nums = {4, 1, 3,12, 5};
        int countEven = 0;
        int countOdd = 0;
        String evenNums = "";
        String oddNums = "";

//        for( int each : nums){
//            if(each % 2 ==0 ){
//                countEven++;
//                System.out.println("Even: " + countEven);
//                System.out.println("Even nums : " + each);
//            }else{
//                countOdd++;
//                System.out.println("odd: " + countOdd);
//                System.out.println("Even nums : " + each);
//            }
//        }




        for( int each : nums){
            if(each % 2 ==0 ){
                countEven++;
                evenNums +=each + " ";
            }else{
               countOdd++;
               oddNums +=each + "";
            }
        }

        System.out.println("Even : " + countEven);
        System.out.println("Odd : " + countOdd);
        System.out.println("odd : " + oddNums);
        System.out.println("even:  " + evenNums);







    }
}
