package day21_arrays;

public class AvarageNumber {
    public static void main(String[] args) {
        int [] nums = {10, 15, 7, 3};
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }

        System.out.println("Sum with fori " + sum);
        System.out.println("Avarage with fori : " + sum/ nums.length);
        sum = 0;
        for(int each : nums){
            sum += each;
        }
        System.out.println("Sum with foreach: " + sum);
        System.out.println("Avarage with foreach : " + sum/ nums.length);


    }
}
